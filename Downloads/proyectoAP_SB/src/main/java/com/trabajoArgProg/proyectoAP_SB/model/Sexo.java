
package com.trabajoArgProg.proyectoAP_SB.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name="sexo")
public class Sexo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    @Column(name="id")
    private Long id;
    
    @Column(name="sexo")
    private String sexo;
    
    
    public Sexo() {
    }

    public Sexo(Long id, String sexo) {
        this.id = id;
        this.sexo = sexo;
    }

    
}
