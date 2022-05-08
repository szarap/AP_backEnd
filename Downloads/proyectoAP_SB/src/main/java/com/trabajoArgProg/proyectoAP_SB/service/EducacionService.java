
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Educacion;
import com.trabajoArgProg.proyectoAP_SB.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
    eduRepo.deleteById(id);    
    }

    @Override
    public Educacion buscarEducacion(Long id) {
    return eduRepo.findById(id).orElse(null);    
    }

    @Override
    public void editarEducacion(Educacion edu) {
    eduRepo.save(edu);    
    }

    
}
