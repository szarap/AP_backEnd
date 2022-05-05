package com.trabajoArgProg.proyectoAP_SB.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="educacion")
public class Educacion {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;

@Temporal(TemporalType.DATE)
@Column(name="fechaInicio")
private Date fechaInicio;

@Temporal(TemporalType.DATE)
@Column(name="fechaFin")
private Date fechaFin;

//----mapeo con Persona
@ManyToOne
@JoinColumn(name="persona_id")
@JsonBackReference
private Persona persona_id;

//----mapeo con tipo Educacion
@ManyToMany
   private Collection<TipoEducacion> tipoeducaciones = new HashSet();




public Educacion() {
    }

    public Educacion(Long id, String nombre, Date fechaInicio, Date fechaFin, Persona persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.persona_id = persona_id;
    }

 


}

