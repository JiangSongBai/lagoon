import {Component} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {LoginService} from '../services/login.service';

@Component({
  selector:'login',
  templateUrl: 'app/components/login.component.html'
})
export class Login {
  private model = {'username':'', 'password':''};
  private currentUserName;

  constructor(private loginService: LoginService){}

  onSubmit() {
    this.loginService.sendCredentials(this.model).subscribe(
      data => {
        // En data el server me ha devuelto el token, lo almaceno
        localStorage.setItem("token", JSON.parse(JSON.stringify(data))._body);

        // Vuelvo a lanzar el token patra Probar y almaceno info de usario
        this.loginService.sendToken(localStorage.getItem("token")).subscribe(
          data => {
            this.currentUserName = this.model.username;
            localStorage.setItem("currentUserName", this.model.username);
            this.model.username = "";
            this.model.username = "";
          })
      })
  }
}
