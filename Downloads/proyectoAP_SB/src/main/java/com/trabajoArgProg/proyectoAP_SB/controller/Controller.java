package com.trabajoArgProg.proyectoAP_SB.controller;

import com.trabajoArgProg.proyectoAP_SB.model.Educacion;
import com.trabajoArgProg.proyectoAP_SB.model.ExperienciaLaboral;
import com.trabajoArgProg.proyectoAP_SB.model.Persona;
import com.trabajoArgProg.proyectoAP_SB.model.Proyecto;
import com.trabajoArgProg.proyectoAP_SB.model.Sexo;
import com.trabajoArgProg.proyectoAP_SB.model.Tecnologia;
import com.trabajoArgProg.proyectoAP_SB.model.TipoEducacion;
import com.trabajoArgProg.proyectoAP_SB.model.TipoTrabajo;
import com.trabajoArgProg.proyectoAP_SB.model.User;
import com.trabajoArgProg.proyectoAP_SB.service.IEducacionService;
import com.trabajoArgProg.proyectoAP_SB.service.IExperienciaLaboralService;
import com.trabajoArgProg.proyectoAP_SB.service.IPersonaService;
import com.trabajoArgProg.proyectoAP_SB.service.IProyectoService;
import com.trabajoArgProg.proyectoAP_SB.service.ISexoService;
import com.trabajoArgProg.proyectoAP_SB.service.ITecnologiaService;
import com.trabajoArgProg.proyectoAP_SB.service.ITipoEducacionService;
import com.trabajoArgProg.proyectoAP_SB.service.ITipoTrabajoService;
import com.trabajoArgProg.proyectoAP_SB.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
//-------------------------------------------------------------------------
            //Persona Controller
@Autowired
private IPersonaService persoServ;
        
@PostMapping("/new/persona")
public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
}

@GetMapping("/ver/persona")
@ResponseBody
public List<Persona> verPersonas(){
   return persoServ.verPersonas();
}

@DeleteMapping("/delete/{id}")
public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
}
//falta agregar el update persona

//-------------------------------------------------------------------------
            //Controller SEXO
@Autowired
private ISexoService sexoServ;

@PostMapping ("/new/sexo")
public void crearSexo(@RequestBody Sexo sexo){
    sexoServ.crearSexo(sexo);
}

@GetMapping ("/ver/sexo")
@ResponseBody
public List<Sexo> verSexo(){
    return sexoServ.verSexo();
}

@DeleteMapping("/deleteSexo/{id}")
public void borrarSexo(@PathVariable Long id){
    sexoServ.borrarSexo(id);
}
//falta agregar updateSexo

//-------------------------------------------------------------------------
        //controller User
@Autowired
private IUserService userServ;


@PostMapping ("/new/user")
public void crearUser(@RequestBody User user){
    userServ.crearUser(user);
}


@GetMapping("/ver/user")
@ResponseBody
public List<User> verUser(){
   return userServ.verUser();
}

@DeleteMapping("/deleteUser/{id}")
public void borrarUser(@PathVariable Long id){
    userServ.borrarUser(id);
}
//falta agregar updateUser
//-------------------------------------------------------------------------
        //controller Proyecto
@Autowired
private IProyectoService proyServ;

@PostMapping ("/new/proyecto")
public void crearProyecto(@RequestBody Proyecto proyecto){
    proyServ.crearProyecto(proyecto);
}

@GetMapping ("/ver/proyecto")
@ResponseBody
public List<Proyecto> verProyecto(){
    return proyServ.verProyecto();
}

@DeleteMapping("/deleteProyecto/{id}")
public void borrarProyecto(@PathVariable Long id){
    proyServ.borrarProyecto(id);
}

//-------------------------------------------------------------------------
        //contrller Exp Laboral
@Autowired
private IExperienciaLaboralService expeServ;

@PostMapping ("/new/experienciaLaboral")
public void crearExperienciaLaboral(@RequestBody ExperienciaLaboral experiencialaboral){
    expeServ.crearExperienciaLaboral(experiencialaboral);
}

@GetMapping ("/ver/experienciaLaboral")
@ResponseBody
public List<ExperienciaLaboral> verExperienciaLaboral(){
    return expeServ.verExperienciaLaboral();
}

@DeleteMapping("/deleteExperienciaLaboral/{id}")
public void borrarExperienciaLaboral(@PathVariable Long id){
    expeServ.borrarExperienciaLaboral(id);
}

//-------------------------------------------------------------------------
        //contrller TipoTrabajo
@Autowired
private ITipoTrabajoService tipotrabServ;

@PostMapping ("/new/tipoTrabajo")
public void crearTipoTrabajo(@RequestBody TipoTrabajo tipotrabajo){
    tipotrabServ.crearTipoTrabajo(tipotrabajo);
}

@GetMapping ("/ver/tipoTrabajo")
@ResponseBody
public List<TipoTrabajo> verTipoTrabajo(){
    return tipotrabServ.verTipoTrabajo();
}

@DeleteMapping("/deleteTipoTrabajo/{id}")
public void borrarTipoTrabajo(@PathVariable Long id){
    tipotrabServ.borrarTipoTrabajo(id);
}

//-------------------------------------------------------------------------
        //contrller TipoEducacion
@Autowired
private ITipoEducacionService tipoeduServ;

@PostMapping ("/new/tipoEducacion")
public void crearTipoEducacion(@RequestBody TipoEducacion tipoeducacion){
    tipoeduServ.crearTipoEducacion(tipoeducacion);
}

@GetMapping ("/ver/tipoEducacion")
@ResponseBody
public List<TipoEducacion> verTipoEducacion(){
    return tipoeduServ.verTipoEducacion();
}

@DeleteMapping("/deleteTipoeducacion/{id}")
public void borrarTipoEducacion(@PathVariable Long id){
    tipoeduServ.borrarTipoEducacion(id);
}
//-------------------------------------------------------------------------
        //contrller Educacion
@Autowired
private IEducacionService eduServ;

@PostMapping ("/new/educacion")
public void crearEducacion(@RequestBody Educacion educacion){
    eduServ.crearEducacion(educacion);
}

@GetMapping ("/ver/educacion")
@ResponseBody
public List<Educacion> verEducacion(){
    return eduServ.verEducacion();
}

@DeleteMapping("/deleteEducacion/{id}")
public void borrarEducacion(@PathVariable Long id){
    eduServ.borrarEducacion(id);
}

//-------------------------------------------------------------------------
        //contrller tecnologia
@Autowired
private ITecnologiaService tecnoServ;

@PostMapping ("/new/tecnologia")
public void crearTecnologia(@RequestBody Tecnologia tecnologia){
    tecnoServ.crearTecnologia(tecnologia);
}

@GetMapping ("/ver/tecnologia")
@ResponseBody
public List<Tecnologia> verTecnologia(){
    return tecnoServ.verTecnologia();
}

@DeleteMapping("/deleteTecnologia/{id}")
public void borrarTecnologia(@PathVariable Long id){
    tecnoServ.borrarTecnologia(id);
}

}
