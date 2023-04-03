package exercicio.heranca;

import java.util.Date;

public class Funcionario extends Pessoa {
    private int numCadastro;
    public Funcionario(String _nome, String _cpf, Date _dataNascimento, int aNumCadastro){
        super(_nome, _cpf, _dataNascimento);
        this.numCadastro =  aNumCadastro;
    }
    public void getFuncionario() {
        System.out.println("Nome Funcionário: " + getNome());
        System.out.println("Número de CPF: " + getCpf());
        System.out.println("Data de Nascimetno: " + getDataNascimento());
        System.out.println("Número cadastro: " + numCadastro);
    }

    public int getNumCadastro() {
        return this.numCadastro;
    }
}
