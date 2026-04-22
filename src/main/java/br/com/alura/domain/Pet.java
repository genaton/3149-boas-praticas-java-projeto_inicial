package br.com.alura.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {

    public Pet() {

    }

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    @JsonProperty("id")
    
    private Long id;
    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("raca")
    private String raca;

    @JsonProperty("idade")
    private int idade;

    @JsonProperty("cor")
    private String cor;

    @JsonProperty("peso")
    private Float peso;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public Float getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }
}
