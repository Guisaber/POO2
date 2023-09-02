package ProjetoPoo2;

public class pessoaJuridica extends pessoa{

    private String cnpj;

    public pessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }


    public String getCnpj(String cnpj){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

}
