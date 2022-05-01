
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.TipoEducacion;
import java.util.List;


public interface ITipoEducacionService {
    
    public List <TipoEducacion> verTipoEducacion();
    
    public void crearTipoEducacion(TipoEducacion edyc);
    
    public void borrarTipoEducacion(Long id);
    
    public TipoEducacion buscarTipoEducacion(Long id); 
}
