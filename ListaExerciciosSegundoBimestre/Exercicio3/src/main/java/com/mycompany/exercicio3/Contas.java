/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class Contas {

    public static void main(String[] args) {
     ContaBancaria conta = new ContaBancaria("Matheus", 1245, 1000);

        ContaPoupanca poupanca = new ContaPoupanca(conta, 15);
        ContaEspecial especial = new ContaEspecial(conta, 500);
        
        conta.sacar(1000);
        especial.sacar(500);
        poupanca.calculaNovoSaldo();
        System.out.println(conta.toString());
    }
}
