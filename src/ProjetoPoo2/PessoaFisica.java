package ProjetoPoo2;

import java.time.LocalDate;
import java.time.Period;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private LocalDate dataDeNascimento;

    public PessoaFisica (){
        super();
    }
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf(String cpf){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }



    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento);
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

}
