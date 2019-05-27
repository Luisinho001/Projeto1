package com.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto1.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@RequestMapping(value = "/usuario")
	public String getUsuarios(Model model) {
		model.addAttribute("userList", this.usuarioRepository.findAll());
		return "usuario";
	}

}
