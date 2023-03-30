/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicio06;

/**
 *
 * @author Diego
 */
public class Turma {

    private int numSala;
    private String materia;
    private int qtdAlunos;
    private Aluno aluno;

    public Turma(int aNumSala, String aMateria, int aQtdAlunos, Aluno aluno) {
        this.numSala = aNumSala;
        this.materia = aMateria;
        this.qtdAlunos = aQtdAlunos;
        this.aluno = aluno;
    }
}
