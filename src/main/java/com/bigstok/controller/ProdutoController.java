package com.bigstok.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigstok.models.Produto;
import com.bigstok.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtorepository;
	
	@PostMapping("/cadastarProd")//requisição
	public String cadProdutos(@RequestParam(required = false) int categoria ,@RequestParam(required = false) String codBarras,@RequestParam(required = false) String dataCadastro,@RequestParam(required = false) String descricao, @RequestParam(required = false) String fornecedor, @RequestParam(required = false) String incluidoPor,
			@RequestParam(required = false) String produtoNome, @RequestParam(required = false) int qtdProduto) {
		
		Produto produto = new Produto(categoria , codBarras, dataCadastro,descricao, fornecedor, incluidoPor,
				produtoNome, qtdProduto);
		produtorepository.save(produto);
		
		return "CadProdutos";
	}
	
	@GetMapping("/")
	public String cadastrarProdutos() {
		
		
		return "CadProdutos";
		
	}
}
