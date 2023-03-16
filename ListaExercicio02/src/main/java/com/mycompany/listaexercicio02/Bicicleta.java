/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio02;

/**
 *
 * @author aluno
 */
public class Bicicleta {

    public String marca;
    public String fabricante;
    public String modelo;

    private int qtdMarcha;
    private int tamanhoAro;
    private int tamanhoQuadro;
    private boolean freioDisco;

    public Bicicleta(String aMarca, String aFabricante, String aModelo) {
        this.marca = aMarca;
        this.fabricante = aFabricante;
        this.modelo = aModelo;
    }

    public void setMarchaAro(int aQtdMarcha, int aTamanhoAro) {
        this.qtdMarcha = aQtdMarcha;
        this.tamanhoAro = aTamanhoAro;
    }

    public void setQuadroFreio(int aTamanhoQuadro, boolean tipoFreio) {
        this.tamanhoQuadro = aTamanhoQuadro;
        this.freioDisco = tipoFreio;
    }

    public void printBicicleta() {
        System.out.println("Marca da Bicileta: " + marca);
        System.out.println("Fabricante da Bicileta: " + fabricante);
        System.out.println("Modelo da Bicileta: " + modelo);
        System.out.println("Quantidade Marchas da Bicileta: " + qtdMarcha);
        System.out.println("Tamanho do Aro da Bicileta: " + tamanhoAro);
        System.out.println("Tamanho do Quadro Bicileta: " + tamanhoQuadro);
        System.out.println("Tem freio a disco? : " + freioDisco);

    }
}
