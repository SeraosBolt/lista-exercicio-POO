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
public class AlunoAtleta extends Aluno{
    private String modalidade;
    public AlunoAtleta(String _nome, String _cpf, Date _date, int _numMatricula, String _modalidade){
        super(_nome, _cpf, _date, _numMatricula);
        this.modalidade = _modalidade;
    }
    
    public void getAtleta(){
        getAluno();
        System.out.println("E participa na modalidade: " + modalidade);
    }
}
