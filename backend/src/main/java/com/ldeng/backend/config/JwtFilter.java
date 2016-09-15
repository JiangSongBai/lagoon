package com.ldeng.backend.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by d_garcia on 12/09/2016.
 */
// Miararse : https://jwt.io/ y https://github.com/jwtk/jjwt
public class JwtFilter extends GenericFilterBean { // JSON Web Token Filter   --> se debe hacer ya que Angular hace primero un OPTIONS ????

    public void doFilter(final ServletRequest req,
                         final ServletResponse res,
                         final FilterChain chain) throws IOException, ServletException {

        final HttpServletRequest  request  = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;

        final String authHeader =  request.getHeader("authorization");


        if("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);

            chain.doFilter(req, res);
        } else {

            if(authHeader == null || !authHeader.startsWith("Bearer ")){
                throw new ServletException("Missing or invalid Authorization header -> MIA");
            }

            final String token = authHeader.substring(7); // "Bearer " son 7 caracteres....

            try {
                final Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
                request.setAttribute("claims", claims);
            } catch(final SignatureException e) {
                throw new ServletException("Invalid token -> MIA");
            }

            chain.doFilter(req, res);
        }

    }

}

