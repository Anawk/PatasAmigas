package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.time.LocalDate;

public class Adotante extends Pessoa {
    private static int contadorId = 0;
    private String numeroIdentificacao;
    private PreferenciasAdocao preferenciasAdocao;
    private List<String> historicoAdocoes;

    public Adotante(int idPessoa, String nome, String sobrenome, String email, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String nacionalidade, String cpf, LocalDate dataNascimento, String senha, String numeroIdentificacao, PreferenciasAdocao preferenciasAdocao, List<String> historicoAdocoes) {
        super();
        this.numeroIdentificacao = "A" + String.format("%03d", contadorId++);
        this.preferenciasAdocao = new PreferenciasAdocao("", "", 0, 0, "");
        this.historicoAdocoes = new ArrayList<>();
    }

    public Adotante(int idPessoa, String nome, String sobrenome, String email, String logradouro, String numero,
                    String bairro, String cidade, String estado, String pais, String nacionalidade, String cpf,
                    String genero, LocalDate dataNascimento, PreferenciasAdocao preferenciasAdocao, List<String> historicoAdocoes) {
        super(contadorId++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade, cpf, genero, dataNascimento);
        this.preferenciasAdocao = preferenciasAdocao;
        this.historicoAdocoes = historicoAdocoes != null ? historicoAdocoes : new ArrayList<>();
        this.numeroIdentificacao = "A" + String.format("%03d", contadorId++);
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public PreferenciasAdocao getPreferenciasAdocao() {
        return preferenciasAdocao;
    }

    public void setPreferenciasAdocao(PreferenciasAdocao preferenciasAdocao) {
        this.preferenciasAdocao = preferenciasAdocao;
    }

    public List<String> getHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void setHistoricoAdocoes(List<String> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes != null ? historicoAdocoes : new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", \"numeroIdentificacao\":" + numeroIdentificacao +
                ", \"preferenciasAdocao\":" + preferenciasAdocao +
                ", \"historicoAdocoes\":" + historicoAdocoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adotante)) return false;
        if (!super.equals(o)) return false;
        Adotante adotante = (Adotante) o;
        return numeroIdentificacao == adotante.numeroIdentificacao &&
                Objects.equals(preferenciasAdocao, adotante.preferenciasAdocao) &&
                Objects.equals(historicoAdocoes, adotante.historicoAdocoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroIdentificacao, preferenciasAdocao, historicoAdocoes);
    }
}
