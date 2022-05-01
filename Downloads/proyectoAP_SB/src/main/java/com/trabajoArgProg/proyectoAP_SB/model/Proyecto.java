
package com.trabajoArgProg.proyectoAP_SB.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="proyecto")

public class Proyecto {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;

@Temporal(TemporalType.DATE)
@Column(name="anio")
private Date anio;

//@ManyToOne
//@JoinColumn(name="persona_idPersona")
//private Persona persona_idPersona;

//@ManyToMany(mappedBy = "proyectos")
//private Set<Tecnologia> tecnologias;


    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, Date anio, Persona persona_idPersona, Set<Tecnologia> tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        //this.persona_idPersona = persona_idPersona;
        //this.tecnologias = tecnologias;
    }

    
      
    
}


