
package com.trabajoArgProg.proyectoAP_SB.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="users")

public class User {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="email")
private String email;

@Column(name="contrasenia")
private Long contrasenia;

//----mapeo con Persona
@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name="fk_persona")
private Persona fk_persona;


}
