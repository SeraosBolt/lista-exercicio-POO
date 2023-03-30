/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicio06;

/**
 *
 * @author Diego
 */
public class Aluno {

    private String nome;
    private int idade;
    private boolean repetente;
    private double notaMedia;
    private int numSala;
    private boolean cadastrado = false;

    public Aluno(String aNome, int aIdade) {
        this.nome = aNome;
        this.idade = aIdade;
    }

    public void setAluno(boolean aRepetente, double aNotaMedia, int aNumSala, boolean aCadastrado) {
        this.repetente = aRepetente;
        this.notaMedia = aNotaMedia;
        this.numSala = aNumSala;
        this.cadastrado = aCadastrado;
    }
    public boolean getCadastrado(){
        return this.cadastrado;
    }
}
