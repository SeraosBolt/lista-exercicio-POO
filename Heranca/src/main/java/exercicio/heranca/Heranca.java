/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.heranca;
import java.util.Date;
/**
 *
 * @author Diego
 */
public class Heranca {

    public static void main(String[] args) {
        Date data = new Date();
        AlunoAtleta atleta = new AlunoAtleta("Matheus", "123.456.789", data, 71935, "100 metros rasos");
        atleta.getAtleta();
    }
}
