
package com.mycompany.builder;

import java.time.LocalDate;


public class Produto {
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

    Produto(long id, double preco, double peso, double altura, double largura, double profundidade, String titulo, String descricao, String marca, String modelo, String urlFoto, String categoria, int estoque, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, Vendedor vendedor) {
        this.setId(id);
        this.setPreco(preco);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setLargura(largura);
        this.setProfundidade(profundidade);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setUrlFoto(urlFoto);
        this.setCategoria(categoria);
        this.setEstoque(estoque);
        this.setDataCadastro(dataCadastro);
        this.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.setVendedor(vendedor);
        
    }
    public static ProdutoBuilder newBuilder(){
        return new ProdutoBuilder();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("Preço deve ser > 0");
        }
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isEmpty()){
            throw new IllegalArgumentException("Título é obrigatório.");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        if(titulo == null || titulo.isEmpty()){
            throw new IllegalArgumentException("Título é obrigatório.");
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria == null || categoria.isEmpty()){
            throw new IllegalArgumentException("Categoria é obrigatório.");
        }
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        if(dataCadastro != null && this.getDataCadastro()!=null){
          if(dataCadastro.isBefore(this.getDataCadastro()))
              throw new IllegalArgumentException("Data de cadastro não pode ser menor que a data atual");
 
        }
         this.dataCadastro = dataCadastro;

    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if(dataUltimaAtualizacao != null && this.getDataUltimaAtualizacao()!=null){
          if(dataUltimaAtualizacao.isBefore(this.getDataUltimaAtualizacao()))
              throw new IllegalArgumentException("Data de atualizacao não pode ser menor que a data atual");
 
        }
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
       
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        if(vendedor == null){
            throw new IllegalArgumentException("Vendedor é obrigatório.");
        }
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", preco=" + preco + ", peso=" + peso + ", altura=" + altura + ", largura=" + largura + ", profundidade=" + profundidade + ", titulo=" + titulo + ", descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", urlFoto=" + urlFoto + ", categoria=" + categoria + ", estoque=" + estoque + ", dataCadastro=" + dataCadastro + ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", vendedor=" + vendedor + '}';
    }

    
    

  
    
}
