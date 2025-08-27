package dev.java10X.CadastroDeNinjas.Ninjas;

import dev.java10X.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// JPA = Java Persistence API.
// Entity transforma uma classe em uma entidade do BD
@Entity

// table nomeia a tabela no BD
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data


public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;
    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    // @ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key ou chave estrangeira
    private MissaoModel missoes;

}
