package com.trabajoArgProg.proyectoAP_SB.repository;

import com.trabajoArgProg.proyectoAP_SB.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
