
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
@Table(name="tecnologia")
public class Tecnologia {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;

//---- mapeo de tecnologia con Proyecto
@ManyToMany(mappedBy="tecnologias")
@JsonIgnore
private Collection<Proyecto> Proyecto = new HashSet();


    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    
    
}
