/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;
    public ContaBancaria(){
    }
    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public void sacar(float valorSacado){
        if(valorSacado > saldo){
            System.out.println("Saldo Insuficiente");
        }else if(valorSacado <= saldo){
            float novoSaldo = this.saldo - valorSacado;
            System.out.println("Você sacou: " + valorSacado + "da sua conta\n seu saldo agora é de: " + novoSaldo);
            this.saldo = novoSaldo;
        }
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float aSaldo){
        this.saldo = aSaldo;
    }
    public String toString(){
        String resp = String.format("Cliente: %s\nNumero Conta: %d\n Saldo: %f",this.cliente, this.numConta, this.saldo);
        return resp;
    }
}
