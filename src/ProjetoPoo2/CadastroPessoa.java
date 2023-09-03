package ProjetoPoo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    //nao esta funcionando a validação
   PessoaFisica listPessoa = new PessoaFisica();
    public boolean cadastrarPessoa(String nome, String endereco, String cpfRecebido, LocalDate dataDeNascimento) {
            String verificadorCpf;
            String cpf;
            int auxiliar = 0;
            PessoaFisica pessoaFisica;
            System.out.println(listPessoa.retornarTamanhoPF());
                for (int i = 0; i < listPessoa.retornarTamanhoPF(); i++) {
                    System.out.println("entrou");
                    PessoaFisica pessoa = listPessoa.retornarElemento(i);
                    cpf = pessoa.getCpf();
                    if (cpf.equals(cpfRecebido)) {
                        return false;
                    }
                }

            if (auxiliar == 0) {
                pessoaFisica = new PessoaFisica(nome, endereco, cpfRecebido, dataDeNascimento);
                listPessoa.adicionarPessoa(pessoaFisica);
                return true;
            }
    return false;
    }
}


