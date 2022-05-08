
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List <ExperienciaLaboral> verExperienciaLaboral();
    
    public void crearExperienciaLaboral(ExperienciaLaboral expe);
    
    public void borrarExperienciaLaboral(Long id);
    
    public ExperienciaLaboral buscarExperienciaLaboral(Long id);

    public void editarExperienciaLaboral(ExperienciaLaboral expLab);
}
