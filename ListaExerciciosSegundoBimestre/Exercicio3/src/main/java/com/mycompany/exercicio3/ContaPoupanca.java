/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    
    private int diaDeRendimento;
    private ContaBancaria  conta;
    public ContaPoupanca(){
    }
    public ContaPoupanca(ContaBancaria conta, int diaRendimento) {
        this.conta = conta;
        this.diaDeRendimento = diaRendimento;
    }

    public void calculaNovoSaldo() {
        float novoSaldo = conta.getSaldo() + (conta.getSaldo() * ((float)0.3 * this.diaDeRendimento));
        conta.setSaldo(novoSaldo);
        System.out.println("Adicionado: "+ novoSaldo);
    }
    
    
}
