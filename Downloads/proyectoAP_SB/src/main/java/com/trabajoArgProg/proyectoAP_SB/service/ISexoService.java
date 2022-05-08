
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Sexo;
import java.util.List;


public interface ISexoService {
    public List<Sexo> verSexo();
    
    public void crearSexo(Sexo sexo);
    
    public void borrarSexo (Long id);
    
    public Sexo buscarSexo (Long id);

    public void editarSexo(Sexo s);
    
}
