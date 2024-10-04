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
            System.out.println("4. Registrar novo animal");
            System.out.println("5. Listar funcionários");
            System.out.println("6. Listar tutores");
            System.out.println("7. Listar adotantes");
            System.out.println("8. Listar animais");
            System.out.println("9. Sair");
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
                    System.out.println(tutores);
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
                    listarfuncionarios(funcionarios);
                    break;
                case 6: 
                    listartutores(tutores);
                    break;
                case 7:
                    listaradotantes(adotantes);
                    break;
                case 8:
                    listaranimais(animais);
                    break;
                case 9:
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

    private static void listarfuncionarios(List<Funcionario> funcionarios){
        int size = funcionarios.size();
        System.out.println("Lista de Funcionários: ");
        System.out.println(size);// tamanho da lista
        System.out.println(funcionarios.isEmpty()); //true = lista vazia | false = lista com funcionarios
        int indice = 1;
        if (funcionarios.isEmpty()) {
            System.out.println("Sem funcionários cadastrados!");
        }else{
        for(int i = 0; i < size; i++){
            System.out.printf("Funcionário " + indice +  " | Nome: " +  funcionarios.get(i).getNome() + " Sobrenome: " + funcionarios.get(i).getSobrenome()
            + " Número de identificação: " + funcionarios.get(i).getNumeroIdentificacaoFuncionario() + " Cargo: " + funcionarios.get(i).getCargo() + "\n");
            indice++;
        }
    }
    }

    private static void listartutores(List<Tutor> tutores){
        int size = tutores.size();
        System.out.println("Lista de Tutores: ");
        System.out.println(size);// tamanho da lista
        System.out.println(tutores.isEmpty()); //true = lista vazia | false = lista com funcionarios
        int indice = 1;
        if (tutores.isEmpty()) {
            System.out.println("Sem tutores cadastrados!");
        }else{
        for(int i = 0; i < size; i++){
            System.out.printf("Tutor " + indice +  " | Nome: " +  tutores.get(i).getNome() + " Sobrenome: " + tutores.get(i).getSobrenome() + 
             " E-mail: " + tutores.get(i).getEmail() +  " Endereço: " + tutores.get(i).getLogradouro() + "\n");
            indice++;
        }
    }
    }

    private static void listaradotantes(List<Adotante> adotantes){
        int size = adotantes.size();
        System.out.println("Lista de Adotantes: ");
        System.out.println(size);// tamanho da lista
        System.out.println(adotantes.isEmpty()); //true = lista vazia | false = lista com funcionarios
        int indice = 1;
        if (adotantes.isEmpty()) {
            System.out.println("Sem adotantes cadastrados!");
        }else{
        for(int i = 0; i < size; i++){
            System.out.printf("Adotante " + indice +  " | Nome: " +  adotantes.get(i).getNome() + " Sobrenome: " + adotantes.get(i).getSobrenome() +
             " E-mail: " + adotantes.get(i).getEmail() + " Endereço: " + adotantes.get(i).getLogradouro() + " Preferências: " + adotantes.get(i).getPreferenciasAdocao() + "\n");
            indice++;
        }
    }
    }

    private static void listaranimais(List<Animal> animais){
        int size = animais.size();
        System.out.println("Lista de Animais: ");
        System.out.println(size);// tamanho da lista
        System.out.println(animais.isEmpty()); //true = lista vazia | false = lista com funcionarios
        int indice = 1;
        if (animais.isEmpty()) {
            System.out.println("Sem animais cadastrados!");
        }else{
        for(int i = 0; i < size; i++){
            System.out.printf("Animal " + indice +  " | Nome: " +  animais.get(i).getNome() + " Raça: " + animais.get(i).getRaca() +
             " Espécie: " + animais.get(i).getEspecie() + " Idade: " + animais.get(i).getIdade() + " Histórico: " + animais.get(i).getHistoricoMedico() + "\n");
            indice++;
        }
    }
    }
}

