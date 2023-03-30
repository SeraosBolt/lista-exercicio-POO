/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.listaexercicio05;

/**
 *
 * @author Diego
 */
public class ListaExercicio05 {
    static void calculaTotal(double p1,double p2,double p3,double p4,double p5){
        double total = p1+p2+p3+p4+p5;
        
        System.out.println("O Total dos pedidos: " + total);
    }
    public static void main(String[] args) {
        Pedidos pedido1 = new Pedidos();
        Pedidos pedido2 = new Pedidos();
        Pedidos pedido3 = new Pedidos();
        Pedidos pedido4 = new Pedidos();
        Pedidos pedido5 = new Pedidos();
        
        pedido1.setGarcom("Pedro Henrique Alves");
        pedido1.setMesa(1);
        pedido1.setPedido("Lasanha à bolonhesa");
        pedido1.setQuantidade(2);
        pedido1.setValor(35.5);
        
        pedido2.setGarcom("Mariana Santos");
        pedido2.setMesa(10);
        pedido2.setPedido("Feijoada completa");
        pedido2.setQuantidade(12);
        pedido2.setValor(350.5);
        
        pedido3.setGarcom("Gustavo Oliveira");
        pedido3.setMesa(12);
        pedido3.setPedido("Frango xadrez com arroz e legumes");
        pedido3.setQuantidade(2);
        pedido3.setValor(45.5);
        
        pedido4.setGarcom("Ana Paula Costa");
        pedido4.setMesa(8);
        pedido4.setPedido("Salmão grelhado com batatas e legumes");
        pedido4.setQuantidade(2);
        pedido4.setValor(55.5);
        
        pedido5.setGarcom("Lucas Rodrigues");
        pedido5.setMesa(9);
        pedido5.setPedido("Espaguete à carbonara");
        pedido5.setQuantidade(4);
        pedido5.setValor(75.5);
        
        calculaTotal(pedido1.valor,pedido2.valor,pedido3.valor,pedido4.valor,pedido5.valor);
    }
    
}
