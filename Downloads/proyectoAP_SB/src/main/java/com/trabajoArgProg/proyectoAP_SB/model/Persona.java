package com.trabajoArgProg.proyectoAP_SB.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona {
     
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;

@Column(name="apeliido")
private String apellido;

@Temporal(TemporalType.DATE)
@Column(name="fechaNac")
private Date fechaNac;

@Column(name="domicilio")
private String domicilio;

@Column(name="email")
private String email;

@Column(name="urlFoto")
private String urlFoto;

//@ManyToOne
//@JoinColumn(name="Sexo_id")
//private Sexo sexo_id;

@OneToOne(mappedBy ="persona")
private User user;

//@OneToOne
//@JoinColumn(name="user", 
 //       referencedColumnName="id", updatable=false)
//private User user;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Date fechaNac, String domicilio, String email, String urlFoto, User user) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.email = email;
        this.urlFoto = urlFoto;
        this.user = user;
    }

  

    
  

    

 



    

 



  

    
}

