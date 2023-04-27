package com.empresa.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.empresa.demo.model.Usuario;
import com.empresa.demo.repository.IUsuarioRepository;

@Controller
public class EmpresaController {
	
	private IUsuarioRepository usuarioRepo;

	@GetMapping("/")
	public String registrar(Model model) {
		model.addAttribute("Usuario", new Usuario());
		return "Formulario";
	}
	
	@GetMapping("/guardar")
	public String enviar(Model model) {
		return null;
	}
}
