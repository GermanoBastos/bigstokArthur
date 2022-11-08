package com.bigstok.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Produto {
		public Produto(int categoria , String codBarras, String dataCadastro,String descricao, String fornecedor, String incluidoPor,
			String produtoNome, int qtdProduto  ) {
		this.qtdProduto = qtdProduto;	
		this.codBarras = codBarras;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.incluidoPor = incluidoPor;
		this.produtoNome = produtoNome;
		this.dataCadastro = dataCadastro;
		this.descricao = descricao;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int qtdProduto;
	private int  categoria;
	private String  codBarras;
	private String  fornecedor;
	private String  incluidoPor;
	private String  produtoNome;
	private String  dataCadastro;
	private String  descricao;
	
}
