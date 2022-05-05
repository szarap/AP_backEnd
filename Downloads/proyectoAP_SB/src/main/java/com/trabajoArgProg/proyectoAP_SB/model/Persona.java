package com.trabajoArgProg.proyectoAP_SB.model;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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

//----mapeo Persona con Sexo
@ManyToOne(cascade= CascadeType.ALL)
@JoinColumn(name="fk_sexo")
private Sexo fk_sexo;

//----mapeo Persona con Educacion
@OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
@JsonManagedReference
private List<Educacion> educaciones;

//----mapeo Persona con Experiencia Laboral
@OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
@JsonManagedReference
private List<ExperienciaLaboral> experiencias;

//----mapeo Persona con Proyecto
@OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
@JsonManagedReference
private List<Proyecto> proyectos;

//----mapeo Persona con 



//@OneToOne(cascade= CascadeType.ALL)
  //  @JoinColumn(name="fk_persona")
    //private Persona persona;

//@OneToOne()
//@JoinColumn(name="user")
//@JsonIgnore
//private User user;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Date fechaNac, String domicilio, String email, String urlFoto, Sexo fk_sexo, List<Educacion> educaciones, List<ExperienciaLaboral> experiencias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.email = email;
        this.urlFoto = urlFoto;
        this.fk_sexo = fk_sexo;
        this.educaciones = educaciones;
        this.experiencias = experiencias;
    }

   

  

}

