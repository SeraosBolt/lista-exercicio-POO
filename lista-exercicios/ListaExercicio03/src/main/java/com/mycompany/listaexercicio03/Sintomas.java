/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio03;

/**
 *
 * @author aluno
 */
public class Sintomas {
    public boolean dorDeCabeca;
    public double temperatura;
    public String pressao;
    public  String nomeSintoma;
    public boolean cadastrado;
    
    public Sintomas(boolean aDorCabeca, double aTemperatura, String aPressao, String aNomeSintoma){
        this.dorDeCabeca = aDorCabeca;
        this.temperatura = aTemperatura;
        this.pressao = aPressao;
        this.nomeSintoma = aNomeSintoma;
        this.cadastrado = true;
    }
    
    public String getSintomas(){
        String retorno = "Com dor de cabeça: "+ dorDeCabeca+ "e com a temperatura: "+  temperatura + "O paciente tem: "+ nomeSintoma;
        return retorno;
    }
}
