
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Persona;
import com.trabajoArgProg.proyectoAP_SB.repository.PersonaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    
    @Autowired
    public PersonaRepository persoRepo;
    
    
    @Override
    public List<Persona> verPersonas(){
    return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
    persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
    persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
    return persoRepo.findById(id).orElse(null);
    }
    
    //falta implementar el editar 
    
    
}
