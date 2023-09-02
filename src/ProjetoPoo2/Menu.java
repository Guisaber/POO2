package ProjetoPoo2;

import java.util.Scanner;

public class Menu {

    public void exibirMenuInicial() {
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Modificar pessoa");
    }
    public void exibirMenuCadastroPessoa (){
        System.out.println("1 - Pessoa física");
        System.out.println("1 - Pessoa Jurídica");
    }
    public boolean cadastroPessoaFisica(){
        Scanner entrada = new Scanner(System.in);
        String nome;
        String endereco;
        String cpf;
        int retorno;
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite seu endereço: ");
        endereco = entrada.nextLine();
        System.out.print("\nDigite seu cpf: ");
        cpf = entrada.next();
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        retorno = cadastroPessoa.cadastrarPessoa(nome,endereco,cpf);
        if (retorno == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    }

