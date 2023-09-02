package ProjetoPoo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    //nao esta funcionando a validação

    public boolean cadastrarPessoa(String nome, String endereco, String cpfRecebido, LocalDate dataDeNascimento) {
            String verificadorCpf;
            String cpf;
            int auxiliar = 0;
            PessoaFisica pessoaFisica;
            List<PessoaFisica> listPessoa = new ArrayList();
            for (int i = 0; i < listPessoa.size(); i++) {
                PessoaFisica pessoa = listPessoa.get(i);
                cpf = pessoa.getCpf();
                if (cpf.equals(cpfRecebido)) {
                    auxiliar = 1;
                    return false;
                }
            }
            if (auxiliar == 0) {
                pessoaFisica = new PessoaFisica(nome, endereco, cpfRecebido, dataDeNascimento);
                listPessoa.add(pessoaFisica);
                return true;
            }
    return false;
    }
}


