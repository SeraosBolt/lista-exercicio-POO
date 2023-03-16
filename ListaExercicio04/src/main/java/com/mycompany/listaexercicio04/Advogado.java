/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio04;

/**
 *
 * @author aluno
 */
public class Advogado {

    public String nome;
    public int idade;

    private int numOab;
    private String escritorio;
    private String especialidade;
    private int numCasosGanhos;
    private int numCasosPerdidos;

    public Advogado(String aNome, int aIdade) {
        this.nome = aNome;
        this.idade = aIdade;
    }

    public void setInfo(int aNumOab, String aEscritorio, String aEspecialidade, int aGanhos, int aPerdidos) {
        this.numOab = aNumOab;
        this.escritorio = aEscritorio;
        this.especialidade = aEspecialidade;
        this.numCasosGanhos = aGanhos;
        this.numCasosPerdidos = aPerdidos;
    }
    
    public void getAdvogado(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(numOab);
        System.out.println(escritorio);
        System.out.println(especialidade);
        System.out.println(numCasosGanhos);
        System.out.println(numCasosPerdidos);
    }
}
