
package com.trabajoArgProg.proyectoAP_SB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
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
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipoEducacion")
public class TipoEducacion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombretedu")
private String nombretedu;

//------ mapeo con Educacion
//@ManyToMany(mappedBy="tipoeducaciones")
//@JsonIgnore
//private Collection<Educacion> educaciones = new HashSet();
  
    public TipoEducacion() {
    }

    public TipoEducacion(Long id, String nombretedu) {
        this.id = id;
        this.nombretedu = nombretedu;
    }



    
}
