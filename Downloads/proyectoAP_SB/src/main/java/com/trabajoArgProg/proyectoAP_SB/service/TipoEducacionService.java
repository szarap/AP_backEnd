
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.TipoEducacion;
import com.trabajoArgProg.proyectoAP_SB.repository.TipoEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEducacionService implements ITipoEducacionService{
    
    @Autowired
    public TipoEducacionRepository tipoeduRepo;

    @Override
    public List<TipoEducacion> verTipoEducacion() {
        return tipoeduRepo.findAll();
    }

    @Override
    public void crearTipoEducacion(TipoEducacion tipoedu) {
    tipoeduRepo.save(tipoedu);    
    }

    @Override
    public void borrarTipoEducacion(Long id) {
    tipoeduRepo.deleteById(id);   
    }

    @Override
    public TipoEducacion buscarTipoEducacion(Long id) {
    return tipoeduRepo.findById(id).orElse(null);    
    }
    

    
}
