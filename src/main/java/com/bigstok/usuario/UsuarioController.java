package com.bigstok.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




@Controller
public class UsuarioController {
	
	
	@Autowired private UsuarioService service;
	
	
}
