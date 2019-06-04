package com.utn.model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utn.dao.MySqlDB;

@RestController
public class UsuarioController {



	
	@PostMapping(value="registroUsuario")
	public String getUsuario(@RequestBody() Usuario usuario) {
		try {
			
			MySqlDB connectionMysql = new MySqlDB();
			
			System.out.println(usuario.getUser());
			System.out.print(usuario.getPassword());
			connectionMysql.saveUser(usuario);
			
			return "ok";

		} catch (Exception e) {
			return "ERROR";
		}
	}
}
