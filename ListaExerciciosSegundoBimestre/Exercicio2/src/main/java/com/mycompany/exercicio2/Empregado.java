/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Empregado {
    private String nome;
    protected float salario;
    
    public Empregado(){
    }
    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String toStrig(){
        String resp = String.format("Nome do Empregado %s \n e seu salario: %f", this.nome, this.salario);
        return resp;
    }
}
