
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
   
    @Autowired    
    private IPersonaService persoServ;

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
       return persoServ.verPersonas();
    }      
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

//agregado mio
    @PutMapping ("/modificar/persona")
    public void modificarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
}


}