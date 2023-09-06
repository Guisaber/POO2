package ProjetoPoo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    String nome;
    String endereco;
    String cpf;

    String cnpj;
    String data;
    LocalDate dataDeNascimento;
    boolean retorno;
    public void exibirMenuInicial() {
        System.out.println("0 - Encerrar programa");
        System.out.println("1 - Cadastrar pessoa ou empresa");
        System.out.println("2 - Modificar pessoa ou empresa");
        System.out.println("3 - Listar pessoas cadastradas");
        System.out.println("4 - Listar empresas");
    }

    public void exibirMenuCadastroPessoa() {
        System.out.println("1 - Pessoa física");
        System.out.println("2 - Pessoa Jurídica");
    }

    public boolean cadastroPessoaFisica(CadastroPessoaFisica cadastroPessoa) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite seu endereço: ");
        endereco = entrada.nextLine();
        System.out.print("\nDigite seu cpf: ");
        cpf = entrada.next();
        System.out.print("\nEntre com a data de nascimento (dd/mm/yyyy): \n");
        data = entrada.next();
        dataDeNascimento = TransformarDataDeNascimento(data);
        retorno = cadastroPessoa.cadastrarPessoa(nome, endereco, cpf, dataDeNascimento);
        if (retorno) {
            return true;
        } else {
            return false;
        }

    }

    public boolean alteracaoPessoaFisica(CadastroPessoaFisica cadastroPessoa) {
        Scanner entrada = new Scanner(System.in);
        String cpfDigitado;
        System.out.print("Digite o CPF que deseja realizar alteracao: ");
        cpfDigitado = entrada.nextLine();
        boolean existeCpf = cadastroPessoa.consultarSeCpfExiste(cpfDigitado);
        if(existeCpf) {
            System.out.print("Digite o nome atualizado: ");
            nome = entrada.nextLine();
            System.out.print("\nDigite o endereço atualizado: ");
            endereco = entrada.nextLine();
            System.out.print("\nDigite o cpf atualizado: ");
            cpf = entrada.next();
            System.out.print("\nEntre com a data de nascimento atualizada (dd/mm/yyyy): \n");
            data = entrada.next();
            dataDeNascimento = TransformarDataDeNascimento(data);
            retorno = cadastroPessoa.alterarPessoa(nome, endereco, cpf, dataDeNascimento);
            if (retorno) {
                return true;
            }
            }else{
            System.out.println("Cpf não encontrado.");
        }
        return false;
        }

    public boolean cadastroPessoaJuridica(CadastroPessoaJuridica cadastroEmpresa) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite o endereço da empresa: ");
        endereco = entrada.nextLine();
        System.out.print("\nDigite o CNPJ da empresa: ");
        cnpj = entrada.next();
        retorno = cadastroEmpresa.cadastrarEmpresa(nome, endereco, cnpj);
        if (retorno) {
            return true;
        } else {
            return false;
        }

    }

    public boolean alteracaoPessoaJuridica(CadastroPessoaJuridica cadastroPessoa) {
        Scanner entrada = new Scanner(System.in);
        String cnpjDigitado;
        System.out.print("Digite o CNPJ que deseja realizar alteracao: ");
        cnpjDigitado = entrada.nextLine();
        boolean existeCnpj = cadastroPessoa.consultarSeCnpjExiste(cnpjDigitado);
        if(existeCnpj) {
            System.out.print("Digite o nome da empresa atualizado: ");
            nome = entrada.nextLine();
            System.out.print("\nDigite o endereço da empresa atualizado: ");
            endereco = entrada.nextLine();
            System.out.print("\nDigite o cnpj da empresa atualizado: ");
            cnpj = entrada.next();
            retorno = cadastroPessoa.alterarEmpresa(nome, endereco, cnpj);
            if (retorno) {
                return true;
            }
        }else{
            System.out.println("Cnpj não encontrado.");
        }
        return false;
    }

        LocalDate TransformarDataDeNascimento (String input){
            try (Scanner scanner = new Scanner(input)) {
                String dateString = scanner.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return LocalDate.parse(dateString, formatter);
            }
        }
    }


