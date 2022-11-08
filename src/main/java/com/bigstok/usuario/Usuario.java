package com.bigstok.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Table(name = "usuarios") //cria tabela de nome usuarios

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gera id automaticamente
	private Integer id;
	
	@Column(nullable = true, unique = true, length = 45) //define a coluna como obrigatoria e define tamanho de caracteres
	private String email;
	
	@Column(nullable = true)
	private String senha;
	
	@Column(nullable = true)
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", senha=" + senha + ", nome=" + nome + "]";
	}
	
	

}
