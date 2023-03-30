/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.heranca;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class Aluno extends Pessoa {

    private int numMatricula;

    public Aluno(String _nome, String _cpf, Date _date, int aNumMatricula) {
        super(_nome, _cpf, _date);
        this.numMatricula = aNumMatricula;
    }

    public void getAluno() {
        System.out.println("Nome Aluno: " + getNome());
        System.out.println("Número de CPF: " + getCpf());
        System.out.println("Data de Nascimetno: " + getDataNascimento());
        System.out.println("Número Matricula: " + numMatricula);
    }

    public int getNumMatricula() {
        return this.numMatricula;
    }
}
