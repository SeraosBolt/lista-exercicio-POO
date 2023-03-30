/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicio03;

/**
 *
 * @author aluno
 */
public class ListaExercicio03 {

    public static void main(String[] args) {
        Sintomas sintoma1 = new Sintomas(true,41.5,"18/9","AIDS");
        Sintomas sintoma2 = new Sintomas(false,35.5,"18/9","VIROSE");
        Sintomas sintoma3 = new Sintomas(true,38.5,"18/9","HEMORRAGIA");
        Paciente paciente1 = new Paciente();
        paciente1.setPaciente("Matheus", 25, "Masculino", "Amil");
        paciente1.setSintoma(sintoma1);
        Paciente paciente2 = new Paciente();
        paciente2.setPaciente("KLEBER", 18, "Masculino", "Amil");
        paciente2.setSintoma(sintoma2);
        Paciente paciente3 = new Paciente();
        paciente3.setPaciente("Maria", 25, "Feminino", "Prevent Senior");
        paciente3.setSintoma(sintoma3);
        Paciente paciente4 = new Paciente();
        paciente4.setPaciente("João", 25, "Masculino", "UNIMED");
        paciente4.setSintoma(sintoma1);
        Paciente paciente5 = new Paciente();
        paciente5.setPaciente("Maria", 25, "Feminino", "Boston");
        paciente5.setSintoma(sintoma2);
        Paciente paciente6 = new Paciente();
        paciente6.setPaciente("Joana", 25, "Feminino", "SUS");
        paciente6.setSintoma(sintoma3);
    }
}
