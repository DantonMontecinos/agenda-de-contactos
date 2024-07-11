package com.gestion.empleados.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gestion.empleados.modelo.Contacto;
import com.gestion.empleados.repositorio.ContactoRepositorio;


@Controller
public class ContactoControlador {
	
	
	@Autowired(required = true)
	private  ContactoRepositorio contactoRepositorio;
	
	
   

	@GetMapping({"/",""})
	public String verPaginaDeInicio() {
		return  "index";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioDeRegistrarContacto(Model modelo) {
		modelo.addAttribute("contacto",new Contacto());
		return "nuevo";
	}
	
	@PostMapping("/nuevo")
	public String guardarContacto(Contacto contacto, RedirectAttributes redirect) {
		contactoRepositorio.save(contacto);
		redirect.addAttribute("msgExito", "Agregado exito");
		return "redirect/:";
	}
	
	 
    @GetMapping("/otro")
    public String verOtro() {
    	return "otro";
    }
		
	

	
}
