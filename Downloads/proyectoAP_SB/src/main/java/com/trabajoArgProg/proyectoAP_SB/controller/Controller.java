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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/")
public class Controller {
    
//------------------------------------------------------------
    //Persona Controller    
@Autowired
private IPersonaService persoServ;
        
@PostMapping("persona/new")
public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
}

@GetMapping("persona/ver")
@ResponseBody
public List<Persona> verPersonas(){
   return persoServ.verPersonas();
}

@DeleteMapping("persona/delete/{id}")
public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
}

@GetMapping( "persona/buscar/{id}")
   public Persona buscarPersona(@PathVariable Long id) {
   return persoServ.buscarPersona(id);
}

@PutMapping("persona/editar")
public void editarPersona(@RequestBody Persona p){
    persoServ.editarPersona(p);
}
//-------------------------------------------------------------------------
            //Controller SEXO
   
   @Autowired
private ISexoService sexoServ;

@PostMapping ("sexo/new")
public void crearSexo(@RequestBody Sexo sexo){
    sexoServ.crearSexo(sexo);
}

@GetMapping ("sexo/ver")
@ResponseBody
public List<Sexo> verSexo(){
    return sexoServ.verSexo();
}

@DeleteMapping("sexo/delete/{id}")
public void borrarSexo(@PathVariable Long id){
    sexoServ.borrarSexo(id);
}

@GetMapping( "sexo/buscar/{id}")
   public Sexo buscarSexo(@PathVariable Long id) {
   return sexoServ.buscarSexo(id);
}

@PutMapping("sexo/editar")
public void editarSexo(@RequestBody Sexo s){
    sexoServ.editarSexo(s);
}   
//-------------------------------------------------------------------------
        //controller User
   
@Autowired
private IUserService userServ;

@PostMapping ("user/new")
public void crearUser(@RequestBody User user){
    userServ.crearUser(user);
}

@GetMapping("user/ver")
@ResponseBody
public List<User> verUser(){
   return userServ.verUser();
}

@DeleteMapping("user/delete/{id}")
public void borrarUser(@PathVariable Long id){
    userServ.borrarUser(id);
}

@GetMapping( "user/buscar/{id}")
   public User buscarUser(@PathVariable Long id) {
   return userServ.buscarUser(id);
}

@PutMapping("user/editar")
public void editarUser(@RequestBody User u){
    userServ.editarUser(u);
}
   //---------inicio--------Controlador para el Login   
@GetMapping("user/email/{email}")
@ResponseBody
public User Email(@PathVariable String email){
    return userServ.findByEmail(email);
}
   
@PostMapping("user/login")
@ResponseBody
public User login(@RequestBody User u){
    return(userServ.findByEmailAndContrasenia(u.getEmail(), u.getContrasenia()));
}
    //---------fin--------Controlador para el Login
   
//-------------------------------------------------------------------------
        //controller Proyecto   
@Autowired
private IProyectoService proyServ;

@PostMapping ("proyecto/new")
public void crearProyecto(@RequestBody Proyecto proyecto){
    proyServ.crearProyecto(proyecto);
}

@GetMapping ("proyecto/ver")
@ResponseBody
public List<Proyecto> verProyecto(){
    return proyServ.verProyecto();
}

@DeleteMapping("proyecto/delete/{id}")
public void borrarProyecto(@PathVariable Long id){
    proyServ.borrarProyecto(id);
}

@GetMapping( "proyecto/buscar/{id}")
   public Proyecto buscarProyecto(@PathVariable Long id) {
   return proyServ.buscarProyecto(id);
}
   
@PutMapping("proyecto/editar")
public void editarProyecto(@RequestBody Proyecto proy){
    proyServ.editarProyecto(proy);
}
//-------------------------------------------------------------------------
        //contrller Exp Laboral   
@Autowired
private IExperienciaLaboralService expeServ;

@PostMapping ("experienciaLaboral/new")
public void crearExperienciaLaboral(@RequestBody ExperienciaLaboral experiencialaboral){
    expeServ.crearExperienciaLaboral(experiencialaboral);
}

@GetMapping ("experienciaLaboral/ver")
@ResponseBody
public List<ExperienciaLaboral> verExperienciaLaboral(){
    return expeServ.verExperienciaLaboral();
}

@DeleteMapping("experienciaLaboral/delete/{id}")
public void borrarExperienciaLaboral(@PathVariable Long id){
    expeServ.borrarExperienciaLaboral(id);
}

@GetMapping( "experienciaLaboral/buscar/{id}")
   public ExperienciaLaboral buscarExperienciaLaboral(@PathVariable Long id) {
   return expeServ.buscarExperienciaLaboral(id);
}
   
@PutMapping("experienciaLaboral/editar")
public void editarExperienciaLaboral(@RequestBody ExperienciaLaboral expLab){
    expeServ.editarExperienciaLaboral(expLab);
}

//@PutMapping("experienciaLaboral/editar/{id}")
//public void editarExperienciaLaboralId(@RequestBody ExperienciaLaboral expLabId){
  //  expeServ.editarExperienciaLaboral(expLabId);
//}
//-------------------------------------------------------------------------
        //contrller TipoTrabajo   
@Autowired
private ITipoTrabajoService tipotrabServ;

@PostMapping ("tipoTrabajo/new")
public void crearTipoTrabajo(@RequestBody TipoTrabajo tipotrabajo){
    tipotrabServ.crearTipoTrabajo(tipotrabajo);
}

@GetMapping ("tipoTrabajo/ver")
@ResponseBody
public List<TipoTrabajo> verTipoTrabajo(){
    return tipotrabServ.verTipoTrabajo();
}

@DeleteMapping("tipoTrabajo/delete/{id}")
public void borrarTipoTrabajo(@PathVariable Long id){
    tipotrabServ.borrarTipoTrabajo(id);
}

@GetMapping( "tipoTrabajo/buscar/{id}")
   public TipoTrabajo buscarTipoTrabajo(@PathVariable Long id) {
   return tipotrabServ.buscarTipoTrabajo(id);
}
   
@PutMapping("tipoTrabajo/editar")
public void editarTipoTrabajo(@RequestBody TipoTrabajo tipotrab){
    tipotrabServ.editarTipoTrabajo(tipotrab);
}
//-------------------------------------------------------------------------
        //contrller TipoEducacion
@Autowired
private ITipoEducacionService tipoeduServ;

@PostMapping ("tipoEducacion/new")
public void crearTipoEducacion(@RequestBody TipoEducacion tipoeducacion){
    tipoeduServ.crearTipoEducacion(tipoeducacion);
}

@GetMapping ("tipoEducacion/ver")
@ResponseBody
public List<TipoEducacion> verTipoEducacion(){
    return tipoeduServ.verTipoEducacion();
}

@DeleteMapping("tipoEducacion/delete/{id}")
public void borrarTipoEducacion(@PathVariable Long id){
    tipoeduServ.borrarTipoEducacion(id);
}

@GetMapping( "tipoEducacion/buscar/{id}")
   public TipoEducacion buscarTipoEducacion(@PathVariable Long id) {
   return tipoeduServ.buscarTipoEducacion(id);
}

@PutMapping("tipoEducacion/editar")
public void editarTipoEducacion(@RequestBody TipoEducacion tipoedu){
    tipoeduServ.editarTipoEducacion(tipoedu);
}
//-------------------------------------------------------------------------
        //contrller Educacion
@Autowired
private IEducacionService eduServ;

@PostMapping ("educacion/new")
public void crearEducacion(@RequestBody Educacion educacion){
    eduServ.crearEducacion(educacion);
}

@GetMapping ("educacion/ver")
@ResponseBody
public List<Educacion> verEducacion(){
    return eduServ.verEducacion();
}

@DeleteMapping("educacion/delete/{id}")
public void borrarEducacion(@PathVariable Long id){
    eduServ.borrarEducacion(id);
}

@GetMapping( "educacion/buscar/{id}")
   public Educacion buscarEducacion(@PathVariable Long id) {
   return eduServ.buscarEducacion(id);
}
   
@PutMapping("educacion/editar")
public void editarEducacion(@RequestBody Educacion edu){
    eduServ.editarEducacion(edu);
}
//-------------------------------------------------------------------------
        //contrller tecnologia
@Autowired
private ITecnologiaService tecnoServ;

@PostMapping ("tecnologia/new")
public void crearTecnologia(@RequestBody Tecnologia tecnologia){
    tecnoServ.crearTecnologia(tecnologia);
}

@GetMapping ("tecnologia/ver")
@ResponseBody
public List<Tecnologia> verTecnologia(){
    return tecnoServ.verTecnologia();
}

@DeleteMapping("tecnologia/delete/{id}")
public void borrarTecnologia(@PathVariable Long id){
    tecnoServ.borrarTecnologia(id);
}

@GetMapping( "tecnologia/buscar/{id}")
   public Tecnologia buscarTecnologia(@PathVariable Long id) {
   return tecnoServ.buscarTecnologia(id);
}
   
@PutMapping("tecnologia/editar")
public void editarTecnologia(@RequestBody Tecnologia tec){
    tecnoServ.editarTecnologia(tec);
}
//-----------------------------------------------------------------------------
}
