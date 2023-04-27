/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {

    private float limite;
    private ContaBancaria  conta;
    public ContaEspecial() {
    }

    public ContaEspecial(ContaBancaria conta, float limite) {
        this.conta = conta;
        this.limite = limite;
    }

    public void sacar(float valorSacado) {
        if(conta.getSaldo() > 0){
            System.out.println("Saldo positivo favor sacar na conta normal");
        }
        else if (conta.getSaldo() <= 0 && valorSacado <= this.limite) {
            float novoSaldo = valorSacado;
            System.out.println("Sacou no especial\n novo saldo: " + novoSaldo);
            conta.setSaldo(novoSaldo);
        } else {
            System.out.println("Não pode sacar sem limite disponivel");
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public float getSaldo(){
        return this.conta.getSaldo();
    }

}
