package com.upe.sipelp.Entidades;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Aluno implements Serializable{
    

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String telefone;
    private String matricula; 
    private String periodo;
    private Integer supervisor_id;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, String cpf, String email, String senha, String telefone, String matricula,
            String periodo, Integer supervisor_id) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.matricula = matricula;
        this.periodo = periodo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(Integer supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha
                + ", telefone=" + telefone + ", matricula=" + matricula + ", periodo=" + periodo + ", supervisor_id="
                + supervisor_id + "]";
    }

    
    

}
