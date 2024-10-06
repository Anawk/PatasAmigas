package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa {

    private static int contadorId = 0;
    private String numeroIdentificacaoFuncionario;
    private LocalDate dataContratacao;
    private String cargo;
    private double salario;
    private String departamento;
    private int idFuncionario;
    private String senha;

    public Funcionario(String nome, String sobrenome, String email, String logradouro, String numero, String bairro,
                       String cidade, String estado, String pais, String nacionalidade, String cpf, String genero,
                       LocalDate dataNascimento, String senha, LocalDate dataContratacao,
                       String cargo, double salario, String departamento) {
        super(contadorId++, nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade, cpf, genero, dataNascimento);
        this.idFuncionario = ++contadorId;
        this.numeroIdentificacaoFuncionario = "F" + String.format("%03d", contadorId++);
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
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
        return super.toString() + ", \"ID Funcionario\":\"" + idFuncionario + "\", \"numeroIdentificacaoFuncionario\":\"" + numeroIdentificacaoFuncionario + "\", \"dataContratacao\":\"" + dataContratacao
                + "\", \"cargo\":\"" + cargo + "\", \"salario\":" + salario + ", \"departamento\":\"" + departamento + "\"";
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
