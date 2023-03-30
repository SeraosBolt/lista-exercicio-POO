/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicio07;

/**
 *
 * @author Diego
 */
public class Jogador {

    private String nome;
    private int idade;
    private String posicao;
    private boolean isLesionado;
    private String time;
    private boolean cadastrado = false;

    public Jogador(String aNome, int aIdade, String aPosicao, boolean aIsLesionado, String aTime, boolean aCadastrado) {
        this.nome = aNome;
        this.idade = aIdade;
        this.posicao = aPosicao;
        this.isLesionado = aIsLesionado;
        this.time = aTime;
        this.cadastrado = aCadastrado;
    }

    public void getNomeIdade() {
        System.out.println("O Jogador: " + nome + " Tem: " + idade + " Anos");
    }

    public void getPosicaoLesao() {
        if (isLesionado) {
            System.out.println("O Jogador: " + nome + " Joga na Posição: " + posicao + " E está atualmente lesionado");
        } else {
            System.out.println("O Jogador: " + nome + " Joga na Posição: " + posicao + " E está atualmente APTO PARA JOGO");
        }
    }

    public void getTime() {
        System.out.println("O Jogador: " + nome + " Joga no time: " + time);
    }
    
    public boolean isCadastrado(){
        return this.cadastrado;
    }
}
