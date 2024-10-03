package entity;

import java.util.Objects;

public class PreferenciasAdocao {
    private String especie;
    private String raca;
    private int idadeMinima;
    private int idadeMaxima;
    private String sexo;

    public PreferenciasAdocao(String especie, String raca, int idadeMinima, int idadeMaxima, String sexo) {
        this.especie = especie;
        this.raca = raca;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
        this.sexo = sexo;
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

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PreferenciasAdocao{" +
                "especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", idadeMinima=" + idadeMinima +
                ", idadeMaxima=" + idadeMaxima +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PreferenciasAdocao)) return false;
        PreferenciasAdocao that = (PreferenciasAdocao) o;
        return idadeMinima == that.idadeMinima &&
                idadeMaxima == that.idadeMaxima &&
                Objects.equals(especie, that.especie) &&
                Objects.equals(raca, that.raca) &&
                Objects.equals(sexo, that.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, raca, idadeMinima, idadeMaxima, sexo);
    }
}
