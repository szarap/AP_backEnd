
package com.trabajoArgProg.proyectoAP_SB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

@Column(name="tipoTrabajo")
private String tipoTrabajo;

    public TipoTrabajo() {
    }

    public TipoTrabajo(Long id, String tipoTrabajo) {
        this.id = id;
        this.tipoTrabajo = tipoTrabajo;
    }


    
}
