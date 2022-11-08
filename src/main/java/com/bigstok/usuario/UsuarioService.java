package com.bigstok.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class UsuarioService {
	
	@Autowired private UsuarioRepository repo;
	
	public List<Usuario> listarTodos(){
		return (List<Usuario>) repo.findAll();
	}
	

}
