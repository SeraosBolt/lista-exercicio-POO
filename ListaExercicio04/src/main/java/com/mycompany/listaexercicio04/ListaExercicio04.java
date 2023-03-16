/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listaexercicio04;

/**
 *
 * @author aluno
 */
public class ListaExercicio04 {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Clara Santos", 55);
        Advogado adv2 = new Advogado("Gabriel Fernandes", 25);
        Advogado adv3 = new Advogado("Isabella Silva", 19);
        Advogado adv4 = new Advogado("Thiago Oliveira", 78);
        Advogado adv5 = new Advogado("Amanda Costa", 60);
        Advogado adv6 = new Advogado("Lucas Souza", 30);
        Advogado adv7 = new Advogado("Juliana Pereira", 45);
        Advogado adv8 = new Advogado("Rafael Rocha", 20);

        adv1.setInfo(33256, "Torres e Advogados Associados", "Advogado Penalista", 15, 5);
        adv2.setInfo(37516, "Ferreira e Cunha Advogados", "Advogado Trabalhista", 5, 5);
        adv3.setInfo(44512, "Lima e Carvalho Advogados", "Advogado Civilista", 35, 15);
        adv4.setInfo(78945, "Oliveira e Santos Advocacia", "Advogado Previdenciário", 78, 5);
        adv5.setInfo(12345, "Martins e Almeida Advogados", "Advogado Ambiental", 35, 0);
        adv6.setInfo(46782, "Silva e Costa Advogados Associados", "Advogado Tributarista", 15, 25);
        adv7.setInfo(79135, "Gonçalves e Rocha Advocacia Empresarial", "Advogado de Propriedade Intelectual", 5, 5);
        adv8.setInfo(46825, "Souza e Ramos Advogados", "Advogado de Direito Empresarial", 49, 50);

        adv6.getAdvogado();
        System.out.println("");
        adv7.getAdvogado();
        System.out.println("");
        adv8.getAdvogado();
    }
}
