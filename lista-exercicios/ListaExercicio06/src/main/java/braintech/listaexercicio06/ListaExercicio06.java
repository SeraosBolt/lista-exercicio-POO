/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.listaexercicio06;

/**
 *
 * @author Diego
 */
public class ListaExercicio06 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas Rodrigues", 12);
        Aluno aluno2 = new Aluno("Ana Paula Costa", 13);
        Aluno aluno3 = new Aluno("Lucas Rodrigues", 14);

        aluno1.setAluno(false, 7.5, 12, false);
        aluno2.setAluno(false, 8.3, 12, true);
        aluno3.setAluno(true, 9.5, 12, true);

        if (aluno1.getCadastrado()) {
            Turma turma1 = new Turma(12, "Matematica", 12, aluno1);
        }
        if (aluno2.getCadastrado()) {
            Turma turma2 = new Turma(12, "História", 8, aluno2);
        }
        if (aluno3.getCadastrado()) {
            Turma turma3 = new Turma(12, "Geografia", 15, aluno3);
        }

    }
}
