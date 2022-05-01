
package com.trabajoArgProg.proyectoAP_SB.repository;

import com.trabajoArgProg.proyectoAP_SB.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral, Long>{
    
}
