
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.User;
import java.util.List;


public interface IUserService {
    
    public List <User> verUser();
    
    public void crearUser(User user);
    
    public void borrarUser(Long id);
    
    public User buscarUser(Long id);

    //----metodos para el Login   
    
    public User findByEmailAndContrasenia(String email, Long contrasenia);    

    public User findByEmail(String email);

}
