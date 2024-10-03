package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String sobrenome;
    private String email;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String nacionalidade;
    private String cpf;
    private String genero;
    private LocalDate dataNascimento;
    private String senha;

    public Pessoa(int idPessoa, String nome, String sobrenome, String email, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String nacionalidade) {}

    public Pessoa(int idPessoa, String nome, String sobrenome, String email, String logradouro,
                  String numero, String bairro, String cidade, String estado, String pais,
                  String nacionalidade, String cpf, String genero, LocalDate dataNascimento, String senha) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }


    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idPessoa == pessoa.idPessoa && Objects.equals(nome, pessoa.nome) &&
                Objects.equals(sobrenome, pessoa.sobrenome) && Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, nome, sobrenome, email);
    }

    @Override
    public String toString() {
        return "{"
                + "\"idPessoa\":" + idPessoa + ","
                + "\"nome\":\"" + nome + "\","
                + "\"sobrenome\":\"" + sobrenome + "\","
                + "\"email\":\"" + email + "\","
                + "\"logradouro\":\"" + logradouro + "\","
                + "\"numero\":\"" + numero + "\","
                + "\"bairro\":\"" + bairro + "\","
                + "\"cidade\":\"" + cidade + "\","
                + "\"estado\":\"" + estado + "\","
                + "\"pais\":\"" + pais + "\","
                + "\"nacionalidade\":\"" + nacionalidade + "\","
                + "\"cpf\":\"" + cpf + "\","
                + "\"genero\":\"" + genero + "\","
                + "\"dataNascimento\":\"" + dataNascimento + "\","
                + "\"senha\":\"" + senha + "\""
                + "}";
    }
}

