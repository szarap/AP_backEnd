
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.Sexo;
import com.trabajoArgProg.proyectoAP_SB.repository.SexoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SexoService implements ISexoService {
@Autowired
public SexoRepository sexoRepo;

    @Override
    public List<Sexo> verSexo() {
    return sexoRepo.findAll();
    }

    @Override
    public void crearSexo(Sexo sexo) {
    sexoRepo.save(sexo);
    }

    @Override
    public void borrarSexo(Long id) {
    sexoRepo.deleteById(id);
    }

    @Override
    public Sexo buscarSexo(Long id) {
    return sexoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSexo(Sexo s) {
        sexoRepo.save(s);
    }
    
    
}
