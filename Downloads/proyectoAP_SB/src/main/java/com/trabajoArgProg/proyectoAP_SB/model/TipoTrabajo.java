
package com.trabajoArgProg.proyectoAP_SB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipoTrabajo")

public class TipoTrabajo {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="tipotrabajo")
private String tipotrabajo;

//@ManyToMany(mappedBy="trabajos")
//@JsonIgnore
//private Collection<ExperienciaLaboral> experiencialaboral = new HashSet();


    public TipoTrabajo() {
    }

    public TipoTrabajo(Long id, String tipotrabajo) {
        this.id = id;
        this.tipotrabajo = tipotrabajo;
    }


    
}
