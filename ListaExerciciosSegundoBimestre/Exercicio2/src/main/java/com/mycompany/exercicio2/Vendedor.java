/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado {

    private float percentualComissao;

    public Vendedor(float percentualComissao, String nome, float salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        String resp = String.format("%s \n Salário com Comissão: %f \n Percentual de comissão: %f", toStrig(), calcularSalario(), this.percentualComissao);
        return resp;
    }

    public float calcularSalario() {
        float salarioFinal =getSalario() + (getSalario() * (this.percentualComissao / 100));
        return salarioFinal;
    }
}
