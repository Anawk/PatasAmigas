package entity;

import java.time.LocalDate;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private String historicoMedico;
    private LocalDate dataCadastro;
    private String statusAdocao;
    private static int contadorId = 0; 
    private int id;

    public Animal(String nome, String especie, String raca, int idade, String sexo,
                  String historicoMedico, LocalDate dataCadastro, String statusAdocao) {
        setNome(nome); 
        this.especie = especie;
        this.raca = raca;
        setIdade(idade); 
        this.sexo = sexo;
        this.historicoMedico = historicoMedico;
        this.dataCadastro = dataCadastro;
        this.statusAdocao = statusAdocao;
        this.id = contadorId++; 
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(String statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Espécie: " + especie +
                ", Raça: " + raca + ", Idade: " + idade + ", Sexo: " + sexo +
                ", Histórico Médico: " + historicoMedico + ", Data de Cadastro: " + dataCadastro +
                ", Status de Adoção: " + statusAdocao;
    }
}
