package com.upe.sipelp.Entidades;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Paciente implements Serializable {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Paciente other = (Paciente) obj;
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
        return true;
    }


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String data_de_nascimento;
    private String cpf;
    private String endereço;
    private String telefone;
    private String email;
    private String contato_de_emergencia;




    private boolean medicacao;
    private String tipo_medicacao;
    private String supervisor_id;

    
    public Paciente() {
    }

    public Paciente(Integer id, String nome, String data_de_nascimento, String cpf, String endereço, String telefone,
    String email, String contato_de_emergencia, boolean medicacao, String supervisor_id) {
this.id = id;
this.nome = nome;
this.data_de_nascimento = data_de_nascimento;
this.cpf = cpf;
this.endereço = endereço;
this.telefone = telefone;
this.email = email;
this.contato_de_emergencia = contato_de_emergencia;
this.medicacao = medicacao;
this.supervisor_id = supervisor_id;
}




    public Paciente(Integer id, String nome, String data_de_nascimento, String cpf, String endereço, String telefone,
            String email, String contato_de_emergencia, boolean medicacao, String tipo_medicacao,
            String supervisor_id) {
        this.id = id;
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.contato_de_emergencia = contato_de_emergencia;
        this.medicacao = medicacao;
        this.tipo_medicacao = tipo_medicacao;
        this.supervisor_id = supervisor_id;
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


    public String getData_de_nascimento() {
        return data_de_nascimento;
    }


    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getContato_de_emergencia() {
        return contato_de_emergencia;
    }


    public void setContato_de_emergencia(String contato_de_emergencia) {
        this.contato_de_emergencia = contato_de_emergencia;
    }


    public boolean isMedicacao() {
        return medicacao;
    }


    public void setMedicacao(boolean medicacao) {
        this.medicacao = medicacao;
    }


    public String getTipo_medicacao() {
        return tipo_medicacao;
    }


    public void setTipo_medicacao(String tipo_medicacao) {
        this.tipo_medicacao = tipo_medicacao;
    }


    public String getSupervisor_id() {
        return supervisor_id;
    }


    public void setSupervisor_id(String supervisor_id) {
        this.supervisor_id = supervisor_id;
    }


    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + ", data_de_nascimento=" + data_de_nascimento + ", cpf=" + cpf
                + ", endereço=" + endereço + ", telefone=" + telefone + ", email=" + email + ", contato_de_emergencia="
                + contato_de_emergencia + ", medicacao=" + medicacao + ", tipo_medicacao=" + tipo_medicacao
                + ", supervisor_id=" + supervisor_id + "]";
    }

    
   



}
