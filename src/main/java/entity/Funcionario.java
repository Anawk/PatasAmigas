package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa {
    private String numeroIdentificacaoFuncionario;
    private LocalDate dataContratacao;
    private String cargo;
    private double salario;
    private String departamento;


    public Funcionario(int i, String nome, String sobrenome, String email, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String nacionalidade, String numeroIdentificacao, LocalDate dataContratacao, String cargo, double salario, String departamento) {
        super(0, "", "", "", "", "", "", "", "", "", "", "", "", LocalDate.now(), "");
        this.numeroIdentificacaoFuncionario = "";
        this.dataContratacao = LocalDate.now();
        this.cargo = "";
        this.salario = 0.0;
        this.departamento = "";
    }


    public Funcionario(int idPessoa, String nome, String sobrenome, String email, String logradouro, String numero, String bairro, String cidade, String estado, String pais, String nacionalidade,
                       String cpf, String genero, LocalDate dataNascimento, String senha,
                       String numeroIdentificacaoFuncionario, LocalDate dataContratacao, String cargo, double salario, String departamento) {
        super(idPessoa, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade, cpf, genero, dataNascimento, senha);
        this.numeroIdentificacaoFuncionario = numeroIdentificacaoFuncionario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }


    public String getNumeroIdentificacaoFuncionario() {
        return numeroIdentificacaoFuncionario;
    }

    public void setNumeroIdentificacaoFuncionario(String numeroIdentificacaoFuncionario) {
        this.numeroIdentificacaoFuncionario = numeroIdentificacaoFuncionario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return super.toString() + ", \"numeroIdentificacaoFuncionario\":\"" + numeroIdentificacaoFuncionario + "\", \"dataContratacao\":\"" + dataContratacao + "\", \"cargo\":\"" + cargo
                + "\", \"salario\":" + salario + ", \"departamento\":\"" + departamento + "\"";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(that.salario, salario) == 0 &&
                Objects.equals(numeroIdentificacaoFuncionario, that.numeroIdentificacaoFuncionario) &&
                Objects.equals(dataContratacao, that.dataContratacao) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(departamento, that.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroIdentificacaoFuncionario, dataContratacao, cargo, salario, departamento);
    }
}

