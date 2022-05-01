
package com.trabajoArgProg.proyectoAP_SB.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="experienciaLaboral")

public class ExperienciaLaboral {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombreExperiencia")
private String nombreExperiencia;

@Column(name="actual")
private boolean actual;

@Temporal(TemporalType.DATE)
@Column(name="fechaInicio")
private Date fechaInicio;

@Temporal(TemporalType.DATE)
@Column(name="fechaFin")
private Date fechaFin;

@Column(name="descripcion")
private String descripcion;

//@ManyToOne
//@JoinColumn(name="persona_idPersona")
//private Persona persona_idPersona;

//@ManyToOne
//@JoinColumn(name="tipoTrabajo_idTrabajo")
//private TipoTrabajo tipoTrabajo_idTrabajo;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String nombreExperiencia, boolean actual, Date fechaInicio, Date fechaFin, String descripcion, Persona persona_idPersona, TipoTrabajo tipoTrabajo_idTrabajo) {
        this.id = id;
        this.nombreExperiencia = nombreExperiencia;
        this.actual = actual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        //this.persona_idPersona = persona_idPersona;
        //this.tipoTrabajo_idTrabajo = tipoTrabajo_idTrabajo;
    }

    

   
    



}
