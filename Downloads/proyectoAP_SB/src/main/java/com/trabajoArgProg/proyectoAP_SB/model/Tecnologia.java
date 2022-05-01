
package com.trabajoArgProg.proyectoAP_SB.model;

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

//@ManyToMany(cascade = {
  //          CascadeType.PERSIST,
    //        CascadeType.MERGE
    //})
    //@JoinTable(
      //      name = "tecnologia_proyecto",
        //    joinColumns = {@JoinColumn(name = "tecnologia_id")},
          //  inverseJoinColumns = {@JoinColumn(name = "proyecto_id")}
   // )
   // private Set<Proyecto> proyectos;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, Set<Proyecto> proyectos) {
        this.id = id;
        this.nombre = nombre;
      //  this.proyectos = proyectos;
    }


  


}
