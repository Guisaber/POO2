package ProjetoPoo2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastroPessoaFisica cadastroPessoa = new CadastroPessoaFisica();
        CadastroPessoaJuridica cadastroEmpresa = new CadastroPessoaJuridica();
        Menu menu = new Menu();
        int opcao;
        do {
            menu.exibirMenuInicial();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    boolean resultadoCadastro;
                    menu.exibirMenuCadastroPessoa();
                    opcao = entrada.nextInt();
                    if (opcao == 1){
                            resultadoCadastro = menu.cadastroPessoaFisica(cadastroPessoa);
                            if (resultadoCadastro) {
                                System.out.println("Cadastro realizado com sucesso!\n");
                                PessoaFisicaRepositorio.listarPessoas(); //falta fazer isso funcionar
                            } else {
                                System.out.println("Cpf existente na base\n");
                            }

                    }else if (opcao == 2){
                        resultadoCadastro = menu.cadastroPessoaJuridica(cadastroEmpresa);
                        if (resultadoCadastro) {
                            System.out.println("Cadastro realizado com sucesso!\n");
                            PessoaJuridicaRepositorio.listarPessoasJuridicas();
                        } else {
                            System.out.println("Cnpj existente na base\n");
                        }

                    }else{
                        System.out.println("Opção inválida");
                    }
                    break;
                case 2:
                    boolean alterado;
                    menu.exibirMenuCadastroPessoa();
                    opcao = entrada.nextInt();
                        if (opcao == 1){
                            alterado = menu.alteracaoPessoaFisica(cadastroPessoa);
                            if (alterado) {
                                System.out.println("Cadastro atualizado com sucesso!\n");
                                PessoaFisicaRepositorio.listarPessoas();
                            }

                    } else if (opcao == 2) {
                            alterado = menu.alteracaoPessoaJuridica(cadastroEmpresa);
                            if (alterado) {
                                System.out.println("Cadastro atualizado com sucesso!\n");
                                PessoaJuridicaRepositorio.listarPessoasJuridicas();
                            }
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    break;
                case 3:
                    PessoaFisicaRepositorio.listarPessoas();
                case 4:
                    PessoaJuridicaRepositorio.listarPessoasJuridicas();
            }//switch principal acaba aqui



        }while(opcao != 0);
    }

}
