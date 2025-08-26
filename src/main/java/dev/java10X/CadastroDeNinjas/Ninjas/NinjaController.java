package dev.java10X.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    //@GetMapping("localhost:8080/boasVindas") nao é necessario utilizar o local host para a rota da controller
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Minha primeira menssagem";
    }
}
