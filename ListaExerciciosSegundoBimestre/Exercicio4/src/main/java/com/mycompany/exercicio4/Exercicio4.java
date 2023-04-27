/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

/**
 *
 * @author aluno
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Peixe peixe = new Peixe("Beta", "Azul", "Agua", 12, 0, (float)1.3);
        Mamifero mamifero = new Mamifero("Camelo", "Amarelo", "Deserto", 3 ,4, 4, "Cacto" );
        peixe.alterarCaracteristica("Briguento");
        mamifero.alteraAlimento("Feijão");
        peixe.dados();
        System.out.println("");
        mamifero.dados();
    }
}
