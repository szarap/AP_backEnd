
package com.trabajoArgProg.proyectoAP_SB.repository;

import com.trabajoArgProg.proyectoAP_SB.model.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long>{
    
}
