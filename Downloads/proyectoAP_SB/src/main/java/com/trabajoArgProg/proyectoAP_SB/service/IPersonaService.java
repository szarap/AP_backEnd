
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
            
    
    
}

 