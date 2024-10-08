package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tutor extends Pessoa {
    private static int contadorTutores = 0;
    private String numeroIdentificacao;
    private int numeroAnimaisSobCustodia;
    private List<String> historicoAdocoes;

    public Tutor() {
        super();
        this.numeroAnimaisSobCustodia = 0;
        this.historicoAdocoes = new ArrayList<>();
    }

    public Tutor(String nome, String sobrenome, String email, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String nacionalidade, String cpf, String genero, LocalDate dataNascimento, int numeroAnimaisSobCustodia, List<String> historicoAdocoes) {
        super(contadorTutores++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade, cpf, genero, dataNascimento);
        this.numeroIdentificacao = "T" + String.format("%03d", contadorTutores++);
        this.numeroAnimaisSobCustodia = numeroAnimaisSobCustodia;
        this.historicoAdocoes = historicoAdocoes != null ? historicoAdocoes : new ArrayList<>();
    }

    private static int gerarNovoId() {
        return ++contadorTutores;
    }


    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getNumeroAnimaisSobCustodia() {
        return numeroAnimaisSobCustodia;
    }

    public void setNumeroAnimaisSobCustodia(int numeroAnimaisSobCustodia) {
        this.numeroAnimaisSobCustodia = numeroAnimaisSobCustodia;
    }

    public List<String> getHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void setHistoricoAdocoes(List<String> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes != null ? historicoAdocoes : new ArrayList<>();
    }

    public void adicionarAdocao(String nomeAnimal) {
        this.historicoAdocoes.add(nomeAnimal);
    }


    @Override
    public String toString() {
        return "Tutor{" +
                "numeroIdentificacao='" + numeroIdentificacao + '\'' +
                ", numeroAnimaisSobCustodia=" + numeroAnimaisSobCustodia +
                ", historicoAdocoes=" + historicoAdocoes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tutor)) return false;
        if (!super.equals(o)) return false;
        Tutor tutor = (Tutor) o;
        return numeroAnimaisSobCustodia == tutor.numeroAnimaisSobCustodia &&
                Objects.equals(numeroIdentificacao, tutor.numeroIdentificacao) &&
                Objects.equals(historicoAdocoes, tutor.historicoAdocoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroIdentificacao, numeroAnimaisSobCustodia, historicoAdocoes);
    }
}
