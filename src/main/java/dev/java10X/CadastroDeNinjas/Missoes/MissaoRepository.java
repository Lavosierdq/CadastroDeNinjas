package dev.java10X.CadastroDeNinjas.Missoes;

import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

// Repassando o controller missaoModel e o tipo do Id que é um long
public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {

}
