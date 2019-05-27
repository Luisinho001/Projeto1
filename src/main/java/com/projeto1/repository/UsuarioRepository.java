package com.projeto1.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.projeto1.entity.Usuario;

// public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	@Query("{'email': ?0}")
	Usuario findByEmailQualquerCoisa(String email);
	
	Usuario findByNomeIgnoreCase(String nome);
	
	/*
	 * Bancos de Dados Relacional
	 * 
	@Query(value = "SELECT * FROM USUARIO u WHERE u.nome like ?1%", 
			  nativeQuery = true)
	Usuario findByNomeQualquerCoisa(String nome);
	
	Usuario findByEmail(String email);
	*/
}
