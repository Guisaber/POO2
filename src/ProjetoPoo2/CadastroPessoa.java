package ProjetoPoo2;

public class CadastroPessoa {

    public int cadastrarPessoa (String nome, String endereco, String cpf){
        String verificadorCpf;
        PessoaFisica pessoaFisica = new PessoaFisica();
        verificadorCpf = pessoaFisica.getCpf(cpf);
        if (verificadorCpf == null){
            PessoaFisica pessoaFisicacriada = new PessoaFisica(nome,endereco,cpf);
            return  0;
        }else {
            return 1;
        }
    }

}
