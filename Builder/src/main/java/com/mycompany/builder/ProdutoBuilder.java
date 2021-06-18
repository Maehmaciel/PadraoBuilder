/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder;

import java.time.LocalDate;


public class ProdutoBuilder {

    private long id;
    private double preco;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private String urlFoto;
    private String categoria;
    private int estoque;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Vendedor vendedor;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder setLargura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder setProfundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public ProdutoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder setEstoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, preco, peso, altura, largura, profundidade, titulo, descricao, marca, modelo, urlFoto, categoria, estoque, dataCadastro, dataUltimaAtualizacao, vendedor);
    }
    
}
