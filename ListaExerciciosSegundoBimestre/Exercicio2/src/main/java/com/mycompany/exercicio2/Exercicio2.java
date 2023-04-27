/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Recursos Humanos", "Kleber", 1500);
        Vendedor vendedor = new Vendedor(12, "Juninho Vendedor", 2500);
        
        System.out.println(gerente.toString());
        System.out.println(vendedor.toString());
        
    }
}
