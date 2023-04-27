package com.CamonesQuirozJ.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CamonesQuirozJ.demo.model.Empleado;
import com.CamonesQuiroz.demo.repository.IUsuarioRepository;

public class EmpleadoComtroller {

	private IUsuarioRepository usuarioRepo;

	@GetMapping("/")
	public String registrar(Model model) {
		model.addAttribute("Empleado", new Empleado());
		return "Formulario";
	}
	
	@GetMapping("/guardar")
	public String enviar(Model model) {
		return null;
	}
}
