/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listaexercicio01;

/**
 *
 * @author aluno
 */
public class ListaExercicio01 {

    public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja(123456);
        Cerveja cerveja2 = new Cerveja(456798987);
        Cerveja cerveja3 = new Cerveja(54787);
        Cerveja cerveja4 = new Cerveja(457546876);
        Cerveja cerveja5 = new Cerveja(587546847);

        cerveja1.setAtributos("Brahma", "Pilsen", 15.50, "5,8%", "AMBEV");
        cerveja2.setAtributos("Skol", "Chopp", 5.50, "2,8%", "KIRIN");
        cerveja3.setAtributos("Sol", "Malzebear", 25.50, "15,8%", "ANTARTICA");
        cerveja4.setAtributos("Budwaiser", "Pilsen", 15.50, "5,8%", "AMBEV");
        cerveja5.setAtributos("Heineken", "Pilsen", 35.50, "8,8%", "ALEMANHA");

        cerveja1.printCerveja();
        cerveja2.printCerveja();
        cerveja3.printCerveja();
        cerveja4.printCerveja();
        cerveja5.printCerveja();

    }
}
