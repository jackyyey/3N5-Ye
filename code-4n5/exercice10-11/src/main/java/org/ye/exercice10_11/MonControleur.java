package org.ye.exercice10_11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MonControleur {

    // on testera avec une requête http://localhost:8080/test/99/test?id=2
    // ou http://localhost:8080/test/77/test
    @GetMapping(value = "/give/money")
    public @ResponseBody String test() {
        System.out.println("Requête reçue : Money");
        return "MONEY$$$$$$$";
    }

    @GetMapping(value = "/bonjour")
    public @ResponseBody String bonjour() {
        System.out.println("Requête reçue sur bonjour ");
        return "bonjour le monde";
    }
}