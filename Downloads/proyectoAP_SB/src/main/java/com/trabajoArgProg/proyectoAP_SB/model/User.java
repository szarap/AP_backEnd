
package com.trabajoArgProg.proyectoAP_SB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user")

public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="userid")
private Long userid;

@Column(name="email")
private String email;

@Column(name="contrasenia")
private Long contrasenia;

@OneToOne
@JoinColumn(name="userid")
private Persona persona;


  
public User() {
    }

    public User(Long userid, String email, Long contrasenia, Persona persona) {
        this.userid = userid;
        this.email = email;
        this.contrasenia = contrasenia;
        this.persona = persona;
    }

  

   




  

}
