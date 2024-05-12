package com.upe.sipelp.Entidades;
import jakarta.persistence.*;
import java.io.Serializable;



@Entity
public class Supervisor implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String crp;
    private String telefone;


    public Supervisor() {
    }


    public Supervisor(Integer id, String nome, String cpf, String email, String senha, String crp,
            String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.crp = crp;
        this.telefone = telefone;
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
  
    public String getCrp() {
        return crp;
    }
    public void setCrp(String crp) {
        this.crp = crp;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Supervisor [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha
                + ", crp=" + crp + ", telefone=" + telefone + "]";
    }


    
    
}
