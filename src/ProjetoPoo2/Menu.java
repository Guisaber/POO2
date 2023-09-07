package ProjetoPoo2;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu <T> {
    String nome, endereco, cpf, cnpj, data, cpfOuCnpj;
    LocalDate dataDeNascimento;
    boolean retorno;

    public void exibirMenuInicial() {
        System.out.println("0 - Encerrar programa");
        System.out.println("1 - Cadastrar pessoa ou empresa");
        System.out.println("2 - Modificar pessoa ou empresa");
        System.out.println("3 - Listar pessoas cadastradas");
        System.out.println("4 - Listar empresas");
        System.out.println("5 - Alugar um veículo");
    }

    public void exibirMenuCadastroPessoa() {
        System.out.println("1 - Pessoa física");
        System.out.println("2 - Pessoa Jurídica");
    }

    public void formulárioAluguelVeiculo() {
        Scanner entrada = new Scanner(System.in);
        String nomeDoCarro, local;
        System.out.println("Digite seu CPF ou CNPJ (Somente números)");
        cpfOuCnpj = entrada.next();
        if (cpfOuCnpj.length() == 11) {
            CadastroPessoaFisica cadastroPessoaFisica = new CadastroPessoaFisica();
            if (cadastroPessoaFisica.consultarSeCpfExiste(cpf)) {
                PessoaFisica pessoa = cadastroPessoaFisica.consultarPessoaFisica(cpfOuCnpj);
            } else {
                System.out.println("Cpf inválido");
            }

        } else if (cpfOuCnpj.length() == 14) {
            CadastroPessoaJuridica cadastroPessoaJuridica = new CadastroPessoaJuridica();
            if (cadastroPessoaJuridica.consultarSeCnpjExiste(cpfOuCnpj)) {
                PessoaJuridica pessoa = cadastroPessoaJuridica.consultarPessoaJuridica(cpfOuCnpj);
            } else {
                System.out.println("Cnpj inválido");
            }

        }
        System.out.println("Digite o nome do carro desejado: ");
        nomeDoCarro = entrada.next();
        System.out.println("Digite o Local de retirada do veículo: ");
        local = entrada.next();
        System.out.println("Digite o dia e horario desejado: ");
        data = entrada.next();
        LocalDateTime dataHora = TransformarDataDeAluguel(data);
        //falta pegar a objeto da classe carro e inserir na tabela AluguelVeiculos
    }


    public boolean cadastroPessoaFisica(CadastroPessoaFisica cadastroPessoa) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite seu endereço: ");
        endereco = entrada.nextLine();
        System.out.print("\nDigite seu cpf (Somente números): ");
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
        if (existeCpf) {
            System.out.print("Digite o nome atualizado: ");
            nome = entrada.nextLine();
            System.out.print("\nDigite o endereço atualizado: ");
            endereco = entrada.nextLine();
            System.out.print("\nDigite o cpf atualizado (Somente números): ");
            cpf = entrada.next();
            System.out.print("\nEntre com a data de nascimento atualizada (dd/mm/yyyy): \n");
            data = entrada.next();
            dataDeNascimento = TransformarDataDeNascimento(data);
            retorno = cadastroPessoa.alterarPessoa(nome, endereco, cpf, dataDeNascimento);
            if (retorno) {
                return true;
            }
        } else {
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
        System.out.print("\nDigite o CNPJ da empresa (Somente números): ");
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
        if (existeCnpj) {
            System.out.print("Digite o nome da empresa atualizado: ");
            nome = entrada.nextLine();
            System.out.print("\nDigite o endereço da empresa atualizado: ");
            endereco = entrada.nextLine();
            System.out.print("\nDigite o cnpj da empresa atualizado (Somente números): ");
            cnpj = entrada.next();
            retorno = cadastroPessoa.alterarEmpresa(nome, endereco, cnpj);
            if (retorno) {
                return true;
            }
        } else {
            System.out.println("Cnpj não encontrado.");
        }
        return false;
    }

    LocalDate TransformarDataDeNascimento(String input) {
        try (Scanner scanner = new Scanner(input)) {
            String dateString = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(dateString, formatter);
        }
    }

    LocalDateTime TransformarDataDeAluguel(String input) {
        try (Scanner scanner = new Scanner(input)) {
            String dateString = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return LocalDateTime.parse(dateString, formatter);
        }
    }

}
