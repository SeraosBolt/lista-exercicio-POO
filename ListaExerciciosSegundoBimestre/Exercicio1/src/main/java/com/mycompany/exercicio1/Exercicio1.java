/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        IngressoVip ingresso = new IngressoVip();
        ingresso.setValor(150);
        ingresso.setValorAdicional(15);
        
        System.out.println(ingresso.toStrig());
    }
}
