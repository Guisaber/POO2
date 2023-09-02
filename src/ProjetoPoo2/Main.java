package ProjetoPoo2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            Menu menu = new Menu();
            menu.exibirMenuInicial();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    menu.exibirMenuCadastroPessoa();
                    opcao = entrada.nextInt();
                    switch (opcao) {
                        case 1:
                            boolean resultadoCadastro;
                            resultadoCadastro = menu.cadastroPessoaFisica();
                            if (resultadoCadastro) {
                                System.out.println("Cadastro realizado com sucesso!\n");
                            } else {
                                System.out.println("Cpf existente na base\n");
                            }
                            break;

                    }
            }
        }while(opcao != 0);
    }

}
