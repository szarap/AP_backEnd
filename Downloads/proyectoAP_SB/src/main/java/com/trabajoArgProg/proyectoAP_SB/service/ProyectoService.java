
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Proyecto;
import com.trabajoArgProg.proyectoAP_SB.repository.ProyectoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyecto(){
    return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
    proyRepo.save(proy);
    }
    
    @Override
    public void borrarProyecto(Long id) {
    proyRepo.deleteById(id);
    }

   @Override
    public Proyecto buscarProyecto(Long id) {
    return proyRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarProyecto(Proyecto proy) {
    proyRepo.save(proy);    
    }
}
