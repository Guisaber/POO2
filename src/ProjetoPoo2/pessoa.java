package ProjetoPoo2;

public class pessoa {

    private String nome;
    private String endereco;

    public pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(String nome){
        return this.nome;
    }

    public String getEndereco(String Endereco){
        return this.endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }





}
