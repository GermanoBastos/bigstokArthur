package com.bigstok;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.bigstok.usuario.Usuario;
import com.bigstok.usuario.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UsuarioRepositoryTest {
	
	@Autowired private UsuarioRepository repo;
	
	@Test
	public void testeAddNew() {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("gedddrmano1000300@gmail.com");
		usuario.setNome("Germadddno");
		usuario.setSenha("gbsndd6666");
		
		Usuario savedUsuario = repo.save(usuario);
		
		Assertions.assertThat(savedUsuario).isNotNull();
		Assertions.assertThat(savedUsuario.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testListAll() {
		
		Iterable<Usuario> usuarios = repo.findAll();
		Assertions.assertThat(usuarios).hasSizeGreaterThan(0);
		
		for(Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		
	}
	
	@Test
	
	public void testeUpdate() {
		Integer usuarioId = 1;
		
		
		
	}
	

}
