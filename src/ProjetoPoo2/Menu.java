package ProjetoPoo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        String data;
        LocalDate dataDeNascimento;
        boolean retorno;
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite seu endereço: ");
        endereco = entrada.nextLine();
        System.out.print("\nDigite seu cpf: ");
        cpf = entrada.next();
        System.out.print("\nEntre com a data de nascimento (dd/mm/yyyy): ");
        data =  entrada.next();
        dataDeNascimento = TransformarDataDeNascimento(data);

        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        retorno = cadastroPessoa.cadastrarPessoa(nome,endereco,cpf,dataDeNascimento);
        if (retorno) {
            return true;
        }
        else {
            return false;
        }

    }
    LocalDate TransformarDataDeNascimento(String input) {
        try (Scanner scanner = new Scanner(input)) {
            String dateString = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(dateString, formatter);
        }
    }
    }

