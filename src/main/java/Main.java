import entity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Tutor> tutores = new ArrayList<>();
        List<Adotante> adotantes = new ArrayList<>();
        List<Animal> animais = new ArrayList<>();

        System.out.println("*************SISTEMA PATAS AMIGAS*************");
        //System.out.println("*****Usuário, efetue seu login no sistema*****");

        //implementar sistema de login do funcionario antes de exibir o menu

        boolean continua = true;
        while (continua) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Registrar novo funcionário");
            System.out.println("2. Registrar novo tutor");
            System.out.println("3. Registrar novo adotante");
            System.out.println("4. Cadastrar novo animal");
            System.out.println("5. Sair");
            //adicionar no menu a listagem de itens em formato de tabela/ edição de informações de itens/
            // busca de itens com filtro/ editar perfil / soft delete / listar animais por caracteristicas

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Funcionario funcionario = criarFuncionario(scanner);
                    funcionarios.add(funcionario);
                    break;
                case 2:
                    Tutor tutor = criarTutor(scanner);
                    tutores.add(tutor);
                    break;
                case 3:
                    Adotante adotante = criarAdotante(scanner);
                    adotantes.add(adotante);
                    break;
                case 4:
                    Animal animal = cadastrarAnimal(scanner);
                    animais.add(animal);
                    break;
                case 5:
                    continua = false;
                    System.out.println("Sistema fechado!");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");
            }
        }

        scanner.close();
    }

    private static Funcionario criarFuncionario(Scanner scanner) {
        System.out.println("\n--- Registro do Novo Funcionário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        System.out.print("Número de Identificação: ");
        String numeroIdentificacao = scanner.nextLine();
        LocalDate dataContratacao = verificaData(scanner, "Data de Contratação (yyyy-MM-dd): ");
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        System.out.println("--- Funcionário Registrado! ---");

        return new Funcionario(nextId++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade,
                numeroIdentificacao, dataContratacao, cargo, salario, departamento);
    }

    private static Tutor criarTutor(Scanner scanner) {
        System.out.println("\n--- Registro do Novo Tutor ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        System.out.print("Número de Identificação: ");
        String numeroIdentificacao = scanner.nextLine();
        System.out.print("Número de Animais sob Custódia: ");
        int numeroAnimaisSobCustodia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--- Tutor Registrado! ---");

        List<String> historicoAdocoes = new ArrayList<>();
        return new Tutor(nextId++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade,
                numeroIdentificacao, numeroAnimaisSobCustodia, historicoAdocoes);
    }

    private static Adotante criarAdotante(Scanner scanner) {
        System.out.println("\n--- Registro do Novo Adotante ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        System.out.print("Número de Identificação: ");
        String numeroIdentificacao = scanner.nextLine();

        PreferenciasAdocao preferenciasAdocao = new PreferenciasAdocao("", "", 0, 0, "");

        boolean preferencias = temPreferencias(scanner);

        if (preferencias) {
            System.out.print("Tipo de Espécie desejada: ");
            String especie = scanner.nextLine();
            System.out.print("Tipo de Raça desejada: ");
            String raca = scanner.nextLine();
            System.out.print("Idade Mínima desejada: ");
            int idadeMinima = Integer.parseInt(scanner.nextLine());
            System.out.print("Idade Máxima desejada: ");
            int idadeMaxima = Integer.parseInt(scanner.nextLine());
            System.out.print("Sexo desejado: ");
            String sexo = scanner.nextLine();

            preferenciasAdocao = new PreferenciasAdocao(especie, raca, idadeMinima, idadeMaxima, sexo);
        }

        System.out.println("--- Adotante Registrado! ---");

        List<String> historicoAdocoes = new ArrayList<>();
        return new Adotante(nextId++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade,
                numeroIdentificacao, preferenciasAdocao, historicoAdocoes);
    }

    private static Animal cadastrarAnimal(Scanner scanner) {
        System.out.println("\n--- Cadastro do Novo Animal ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Histórico Médico: ");
        String historicoMedico = scanner.nextLine();
        LocalDate dataCadastro = LocalDate.now();
        System.out.print("Status de Adoção: ");
        String statusAdocao = scanner.nextLine();
        System.out.println("--- Animal Registrado! ---");

        return new Animal(nome, especie, raca, idade, sexo, historicoMedico, dataCadastro, statusAdocao);
    }

    private static LocalDate verificaData(Scanner scanner, String mensagem) {
        LocalDate data = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            try {
                data = LocalDate.parse(entrada, formatter);
                dataValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("A data está com o formato incorreto, insira no formato yyyy-MM-dd");
            }
        }
        return data;
    }

    private static boolean temPreferencias(Scanner scanner) {
        while (true) {
            System.out.print("Adotante tem preferências para a adoção? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                return true;
            } else if (resposta.equals("n")) {
                return false;
            } else {
                System.out.println("digite 's' para sim ou 'n' para não.");
            }
        }
    }

}

