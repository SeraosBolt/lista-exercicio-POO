/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicio02;

/**
 *
 * @author aluno
 */
public class ListaExercicio02 {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta("Caloi", "Mondles", "Speed");
        bici1.setMarchaAro(5, 15);
        bici1.setQuadroFreio(20, true);
        
        Bicicleta bici2 = new Bicicleta("Monark", "Intel", "BMX");
        bici2.setMarchaAro(15, 10);
        bici2.setQuadroFreio(5, false);
        
        Bicicleta bici3 = new Bicicleta("Raider", "Logitec", "Montain Bike");
        bici3.setMarchaAro(55, 35);
        bici3.setQuadroFreio(25, true);
        
        Bicicleta bici4 = new Bicicleta("Generica", "Pessoal", "LongBike");
        bici4.setMarchaAro(28, 29);
        bici4.setQuadroFreio(17, false);
        
        for(int i =0; i<4;i++){
            System.out.println("Loop: " + i);
            bici1.printBicicleta();
            bici2.printBicicleta();
            System.out.println("FIM Loop: " + i);

        }
    }
}
