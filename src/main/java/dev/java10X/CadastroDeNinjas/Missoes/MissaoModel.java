package dev.java10X.CadastroDeNinjas.Missoes;

import dev.java10X.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;
// criar uma entidade da classe
@Entity
//criar uma tabela
@Table(name = "tb_missoes")
public class MissaoModel {

    // criar uma Id na tabela
    @Id
    //gerenciar as Ids de forma automática
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String  nome;
    private String dificuldade;

    //@OneToMany - Uma missao pode ter vários ninjas
    @OneToMany(mappedBy = "missoes");

    private List<NinjaModel> ninja;
}
