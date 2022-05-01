
package com.trabajoArgProg.proyectoAP_SB.repository;

import com.trabajoArgProg.proyectoAP_SB.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
    
}
