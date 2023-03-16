/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio01;

/**
 *
 * @author aluno
 */
public class Cerveja {

    public String marca;
    public String tipo;
    public double preco;
    public String teorAlcoolico;

    private String fabricante;
    private int codigo;

    public Cerveja(int aCodigo) {
        this.codigo = aCodigo;
    }

    public void setAtributos(String aMarca, String aTipo, double aPreco, String aTeorAlcoolico, String aFabricante) {
        this.marca = aMarca;
        this.tipo = aTipo;
        this.preco = aPreco;
        this.teorAlcoolico = aTeorAlcoolico;
        this.fabricante = aFabricante;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void printCerveja() {
        System.out.println("Marca da Cerveja: " + marca);
        System.out.println("Tipo da Cerveja: " + tipo);
        System.out.println("preço da Cerveja: " + preco);
        System.out.println("Teor Alcoolico da Cerveja: " + teorAlcoolico);
        System.out.println("Fabricante da Cerveja: " + fabricante);
        System.out.println("Código da Cerveja: " + codigo);

    }

}
