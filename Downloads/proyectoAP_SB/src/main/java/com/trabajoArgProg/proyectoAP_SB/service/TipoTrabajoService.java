
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.TipoTrabajo;
import com.trabajoArgProg.proyectoAP_SB.repository.TipoTrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoTrabajoService implements ITipoTrabajoService{
    
    @Autowired
    public TipoTrabajoRepository tipotrabRepo;

    @Override
    public List<TipoTrabajo> verTipoTrabajo() {
    return tipotrabRepo.findAll();
    }

    @Override
    public void crearTipoTrabajo(TipoTrabajo trab) {
    tipotrabRepo.save(trab);    
    }

    @Override
    public void borrarTipoTrabajo(Long id) {
    tipotrabRepo.deleteById(id);    
    }

    @Override
    public TipoTrabajo buscarTipoTrabajo(Long id) {
    return tipotrabRepo.findById(id).orElse(null);    
    }
    
}
