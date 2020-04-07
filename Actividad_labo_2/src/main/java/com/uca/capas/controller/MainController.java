package com.uca.capas.controller;

import com.uca.capas.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
	public String enviarForm(Usuario usuario) {
		return "agregarUsuario";
	}
	
	@PostMapping("/agregarUsuari")
	public String procesarFrom(Usuario usuario) {
		return "mostrarMensaje";
	}

}
