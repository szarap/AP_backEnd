
package com.trabajoArgProg.proyectoAP_SB.repository;

import com.trabajoArgProg.proyectoAP_SB.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
