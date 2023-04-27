/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class Ingresso {
    private float valor;
    
    public Ingresso (){
    }
    public Ingresso (float aValor){
        this.valor = aValor;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public String toString(){
        String valorString = String.format("%f", this.valor);
        return valorString;
    }
}
