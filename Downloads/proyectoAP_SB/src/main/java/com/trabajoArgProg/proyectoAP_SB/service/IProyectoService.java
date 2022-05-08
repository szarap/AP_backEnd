
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List <Proyecto> verProyecto();
    
    public void crearProyecto(Proyecto proy);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);

    public void editarProyecto(Proyecto proy);
}
