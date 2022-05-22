
package com.trabajoArgProg.proyectoAP_SB.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.CascadeType;
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

//----mapeo con Persona
@ManyToOne
@JoinColumn(name="persona_id")
@JsonBackReference
private Persona persona_id;

//----mapeo de Experiencia Lab con Tipo Trabajo
//@ManyToMany
//private Collection<TipoTrabajo> trabajos = new HashSet();
@ManyToOne
private TipoTrabajo trabajos;

    public ExperienciaLaboral() {
    }

    //public ExperienciaLaboral(Long id, String nombreExperiencia, boolean actual, Date fechaInicio, Date fechaFin, String descripcion, Persona persona_id) {
      //  this.id = id;
        //this.nombreExperiencia = nombreExperiencia;
        //this.actual = actual;
        //this.fechaInicio = fechaInicio;
        //this.fechaFin = fechaFin;
        //this.descripcion = descripcion;        
        //this.persona_id = persona_id;
    //}

    public ExperienciaLaboral(Long id, String nombreExperiencia, boolean actual, Date fechaInicio, Date fechaFin, String descripcion, Persona persona_id, TipoTrabajo trabajos) {
        this.id = id;
        this.nombreExperiencia = nombreExperiencia;
        this.actual = actual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
        this.trabajos = trabajos;
    }
    
    





}
