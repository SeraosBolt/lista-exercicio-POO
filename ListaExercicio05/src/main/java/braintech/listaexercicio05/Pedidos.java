/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.listaexercicio05;

/**
 *
 * @author Diego
 */
public class Pedidos {
    private int mesa;
    private String garcom;
    private String pedido;
    private int quantidade;
    public double valor;
    
    public void setMesa(int aMesa){
     this.mesa = aMesa;
    }
    public void setGarcom(String aGarcom){
        this.garcom = aGarcom;
    }
    public void setPedido(String aPedido){
        this.pedido = aPedido;
    }
    public void setQuantidade(int aQuantidade){
        this.quantidade = aQuantidade;
    }
    public void setValor(double aValor){
        this.valor = aValor;
    }
}
