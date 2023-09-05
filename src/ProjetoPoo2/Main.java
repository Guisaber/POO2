package ProjetoPoo2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastroPessoaFisica cadastroPessoa = new CadastroPessoaFisica();
        Menu menu = new Menu();
        int opcao;
        do {
            menu.exibirMenuInicial();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    menu.exibirMenuCadastroPessoa();
                    opcao = entrada.nextInt();
                    switch (opcao) {
                        case 1:
                            boolean resultadoCadastro;
                            resultadoCadastro = menu.cadastroPessoaFisica(cadastroPessoa);
                            if (resultadoCadastro) {
                                System.out.println("Cadastro realizado com sucesso!\n");
                            } else {
                                System.out.println("Cpf existente na base\n");
                            }
                            break;
                    } // termina o switch interno

                case 2:
                    menu.exibirMenuCadastroPessoa();
                    opcao = entrada.nextInt();
                    switch (opcao) {
                        case 1:
                            boolean alterado;
                            alterado = menu.alteracaoPessoaFisica(cadastroPessoa);
                            if (alterado) {
                                System.out.println("Cadastro atualizado com sucesso!\n");
                            }
                            break;
                    }//termina o switch interno

            }//switch principal acaba aqui



        }while(opcao != 0);
    }

}
