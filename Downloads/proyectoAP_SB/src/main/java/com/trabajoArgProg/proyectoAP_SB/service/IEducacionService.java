
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List <Educacion>verEducacion();
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion(Long id);
}
