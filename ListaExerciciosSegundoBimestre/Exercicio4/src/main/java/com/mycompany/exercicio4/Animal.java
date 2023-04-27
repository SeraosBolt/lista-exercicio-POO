/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author aluno
 */
public class Animal {

    protected String nome;
    protected String cor;
    protected String ambiente;
    protected int comprimento;
    protected int patas;
    protected float velocidade;

    public Animal(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.patas = patas;
        this.velocidade = velocidade;
    }

    public void alterarNome(String aNome) {
        this.nome = aNome;
    }

    public void alterarComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void alterarPatas(int patas) {
        this.patas = patas;
    }

    public void alterarCor(String cor) {
        this.cor = cor;
    }

    public void alterarAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void alterarVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    public void dados(){
        System.out.println("Animal");
        System.out.println(this.nome);
        System.out.println("Comprimento");
        System.out.println(this.comprimento);
        System.out.println("Patas");
        System.out.println(this.patas);
        System.out.println("Cor");
        System.out.println(this.cor);
        System.out.println("Ambiente");
        System.out.println(this.ambiente);
        System.out.println("Velocidade");
        System.out.println(this.velocidade);
    }
}
