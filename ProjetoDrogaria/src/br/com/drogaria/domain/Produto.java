package br.com.drogaria.domain;

public class Produto {


	private Long codigo;
	private String descricao;
	private Long quantidade;
	private Double preco;

	/*
	 * 
	 * dev
	 * 
	 * chave estrangeira nao pode ser int usar composicao de objeto produto =
	 * caixa grande, tenho codigo, descr, qtd, e preço dentro dessa caixa
	 * grande, caixa menor, codigo do fabricante e descricao chave estrangeira
	 * deve ser objeto do tipo que ela referencia (Usar Tipo = Fabricante)
	 * Artificio de OOO - usado nos frameworks de persistencia
	 * 
	 * vide abaixo
	 * 
	 * dentro da classe produto tenho a classe fabricante (objeto dentro de
	 * objeto) quando montar produto, posso montar o fabricante
	 * 
	 * importante no JSF listar em uma tabela o resultado da consulta (no
	 * primefaces a tabela só aceita 1 tipo de objeto, ou composicao)
	 * 
	 * Tipo Fabricante usado abaixo = classe Fabricante criada anterior
	 * 
	 * 
	 */

	
	private Fabricante fabricante;  /* 1 produto tem 1 fabricante nesta composicao estudar 1 para n */ 

	/* GETTERS AND SETTERS */
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}	

}
