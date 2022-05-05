
package com.trabajoArgProg.proyectoAP_SB.service;

import com.trabajoArgProg.proyectoAP_SB.model.User;
import com.trabajoArgProg.proyectoAP_SB.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> verUser() {
         return userRepo.findAll();
    }

    @Override
    public void crearUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User buscarUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }  
    
    //---------------
    @Override
    public User findByEmailAndContrasenia(String email, Long contrasenia) {
        return userRepo.findByEmailAndContrasenia(email, contrasenia);
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

   

    
}
