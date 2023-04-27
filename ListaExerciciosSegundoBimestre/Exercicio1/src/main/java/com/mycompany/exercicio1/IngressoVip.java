/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class IngressoVip extends Ingresso{
   private float valorAdicional;
    public IngressoVip(){
    
    }
    public IngressoVip(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String toStrig(){
        String valorAdicionalStrg = String.format("%f", (this.valorAdicional + getValor()));
        return valorAdicionalStrg;
    }
}
