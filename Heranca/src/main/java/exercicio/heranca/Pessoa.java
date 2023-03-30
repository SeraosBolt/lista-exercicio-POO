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
public class Pessoa {

    private String nome;
    private String cpf;
    private Date dataNascimento;

    public Pessoa(String aNome, String aCpf, Date aDataNascimento) {
        this.nome = aNome;
        this.cpf = aCpf;
        this.dataNascimento = aDataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
        
}
