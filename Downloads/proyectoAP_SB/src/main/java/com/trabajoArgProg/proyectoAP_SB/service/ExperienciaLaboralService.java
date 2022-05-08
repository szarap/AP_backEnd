
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.ExperienciaLaboral;
import com.trabajoArgProg.proyectoAP_SB.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{

    @Autowired
    public ExperienciaLaboralRepository expeRepo;
    
    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperienciaLaboral(ExperienciaLaboral expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperienciaLaboral(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperienciaLaboral(ExperienciaLaboral expLab) {
        expeRepo.save(expLab);
    }
    
}
