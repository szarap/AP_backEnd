
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.TipoTrabajo;
import java.util.List;


public interface ITipoTrabajoService {
    
    public List <TipoTrabajo> verTipoTrabajo();
    
    public void crearTipoTrabajo(TipoTrabajo trab);
    
    public void borrarTipoTrabajo(Long id);
    
    public TipoTrabajo buscarTipoTrabajo(Long id);
}
