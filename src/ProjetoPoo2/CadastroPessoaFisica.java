package ProjetoPoo2;

import java.time.LocalDate;

public class CadastroPessoaFisica extends PessoaFisica {
    //nao esta funcionando a validação

    public boolean cadastrarPessoa(String nome, String endereco, String cpfRecebido, LocalDate dataDeNascimento) {
            String verificadorCpf;
            String cpf;

            System.out.println(pessoaFisica.size());
                for (int i = 0; i < pessoaFisica.size(); i++) {
                    System.out.println("entrou");
                    PessoaFisica pessoa = pessoaFisica.get(i);
                    cpf = pessoa.getCpf();
                    if (cpf.equals(cpfRecebido)) {
                        return false;
                    }
                }
                 PessoaFisica Pessoa = new PessoaFisica(nome, endereco, cpfRecebido, dataDeNascimento);
                 pessoaFisica.add(Pessoa);
                return true;

    }
}


