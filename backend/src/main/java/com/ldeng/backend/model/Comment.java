package com.ldeng.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by d_garcia on 09/08/2016.
 */
@Entity
public class Comment {
    public Long getCommetId() {
        return commetId;
    }

    public void setCommetId(Long commetId) {
        this.commetId = commetId;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commetId;

    private String coment;


    @ManyToOne
    @JsonIgnore
    private Photo photo;

    private Long photoId;
    private String userName;


}
