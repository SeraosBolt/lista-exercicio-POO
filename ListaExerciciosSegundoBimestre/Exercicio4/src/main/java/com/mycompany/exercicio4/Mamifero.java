/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author aluno
 */
public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade, String alimento) {
        super(nome, cor, ambiente, comprimento, patas, velocidade);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String alimento() {
        return this.alimento;
    }

    @Override
    public void dados() {
        System.out.println("Animal");
        System.out.println(nome);
        System.out.println("Comprimento");
        System.out.println(comprimento);
        System.out.println("Patas");
        System.out.println(this.patas);
        System.out.println("Cor");
        System.out.println(this.cor);
        System.out.println("Ambiente");
        System.out.println(this.ambiente);
        System.out.println("Velocidade");
        System.out.println(this.velocidade);
        System.out.println("Alimento:");
        System.out.println(alimento());
    }

}
