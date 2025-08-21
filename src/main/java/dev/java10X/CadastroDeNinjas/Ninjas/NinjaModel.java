package dev.java10X.CadastroDeNinjas.Ninjas;

import dev.java10X.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
// JPA = Java Persistence API.
// Entity transforma uma classe em uma entidade do BD
@Entity

// table nomeia a tabela no BD
@Table(name = "tb_cadastro")


public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key ou chave estrangeira
    private MissaoModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
