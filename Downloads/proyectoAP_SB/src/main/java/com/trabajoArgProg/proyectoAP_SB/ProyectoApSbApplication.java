package com.trabajoArgProg.proyectoAP_SB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProyectoApSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApSbApplication.class, args);
	}

        
        //@Bean
        //public WebMvcConfigurer corsConfigurer(){
          //  return new WebMvcConfigurer(){
            //    @Override
              //  public void addCorsMappings(CorsRegistry registry){
                //    registry.addMapping("/**").allowedOrigins("https://porfolio-pablo-gonzalez.web.app")
                  //          .allowedMethods("*").allowedHeaders("*");
                //}
            //};
        //}
        
        
}

