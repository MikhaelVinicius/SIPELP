package com.upe.sipelp.Entidades;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Prontuario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;




    private String data_consulta;
    private String hipotese_medica;
    private String grau_de_emergencia;
    private String avaliacao;
    private Integer paciente_Id;
    
    public Prontuario() {
    }

    public Prontuario(Integer id, String nome, String data_consulta, String hipotese_medica, String grau_de_emergencia,
            String avaliacao, Integer paciente_Id) {
        this.id = id;
        this.nome = nome;
        this.data_consulta = data_consulta;
        this.hipotese_medica = hipotese_medica;
        this.grau_de_emergencia = grau_de_emergencia;
        this.avaliacao = avaliacao;
        this.paciente_Id = paciente_Id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getHipotese_medica() {
        return hipotese_medica;
    }

    public void setHipotese_medica(String hipotese_medica) {
        this.hipotese_medica = hipotese_medica;
    }

    public String getGrau_de_emergencia() {
        return grau_de_emergencia;
    }

    public void setGrau_de_emergencia(String grau_de_emergencia) {
        this.grau_de_emergencia = grau_de_emergencia;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getPaciente_Id() {
        return paciente_Id;
    }

    public void setPaciente_Id(Integer paciente_Id) {
        this.paciente_Id = paciente_Id;
    }

    @Override
    public String toString() {
        return "Prontuario [id=" + id + ", nome=" + nome + ", data_consulta=" + data_consulta + ", hipotese_medica="
                + hipotese_medica + ", grau_de_emergencia=" + grau_de_emergencia + ", avaliacao=" + avaliacao
                + ", paciente_Id=" + paciente_Id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paciente_Id == null) ? 0 : paciente_Id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prontuario other = (Prontuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paciente_Id == null) {
            if (other.paciente_Id != null)
                return false;
        } else if (!paciente_Id.equals(other.paciente_Id))
            return false;
        return true;
    }
    
    


}
