
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    public List <Tecnologia> verTecnologia();
    
    public void crearTecnologia(Tecnologia tecno);
    
    public void borrarTecnologia(Long id);
    
    public Tecnologia buscarTecnologia(Long id);

    public void editarTecnologia(Tecnologia tec);
    
    
}
