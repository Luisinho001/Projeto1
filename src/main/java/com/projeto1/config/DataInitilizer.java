package com.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.projeto1.entity.Usuario;
import com.projeto1.repository.UsuarioRepository;

//import com.projeto1.repository.UserRepository;

@Component
public class DataInitilizer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<Usuario> usuarios = usuarioRepository.findAll();
		if (usuarios.isEmpty()) {
			adicionarUsuraio("Luis Santos", "luis.santos@hotmail.com");
			adicionarUsuraio("Bruna Santos", "bruna.santos@hotmail.com");
			adicionarUsuraio("Irgor", "igor.todesco@hotmail.com");
		}
		
		/*
		 * 
		// métodos customizados.
		Usuario usuario = usuarioRepository.findByNomeIgnoreCase("irgor");
		System.out.println(usuario.getNome());
		
		usuario = usuarioRepository.findByEmailQualquerCoisa("luis.santos@hotmail.com");
		System.out.println(usuario.getNome());
		
		*/
		
		/*

		Usuario usuario = usuarioRepository.findById(3L).get();
		System.out.println(usuario.getNome());
		
		usuario.setNome("Igor Todesco");
		System.out.println(usuario.getNome());
		usuarioRepository.saveAndFlush(usuario);
		
		usuarioRepository.deleteById(2L);
		
		*/
	}

	private void adicionarUsuraio(String nome, String email) {
		Usuario user = new Usuario(nome, email);
		usuarioRepository.save(user);
	}

}
