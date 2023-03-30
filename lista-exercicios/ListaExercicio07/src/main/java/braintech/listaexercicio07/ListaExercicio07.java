/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.listaexercicio07;

/**
 *
 * @author Diego
 */
public class ListaExercicio07 {

    static void proximoJogo(Time time1, Time time2) {
        System.out.println("\"Jogo de hoje é " + time1.getNome() + " vs " + time2.getNome() + " O " + time1.getNome() + " esta a " + time1.statistica() + " jogos sem perder e o time do " + time2.getNome() + "está a " + time2.statistica() + " jogos sem perder");
    }

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel Messi", 25, "Atacante", true, "PSG", true);
        Jogador jogador2 = new Jogador("Cristiano Ronaldo", 35, "Atacante", false, "AL'Nasir", true);
        Jogador jogador3 = new Jogador("Neymar Jr.", 22, "Meia", false, "Santos", false);
        Jogador jogador4 = new Jogador("Kylian Mbappé", 21, "Ponta Esquerda", false, "Monaco", true);
        Jogador jogador5 = new Jogador("Mohamed Salah", 32, "Ponta Direita", true, "Liverpool", true);

        Time timeA = new Time("Manchester City", "Inglaterra", "Ethihad Stadium", 15, jogador1);

        Time timeB = new Time("Corinthians", "Brasil", "Itaquera", 45, jogador4);

        proximoJogo(timeA, timeB);

    }
}
