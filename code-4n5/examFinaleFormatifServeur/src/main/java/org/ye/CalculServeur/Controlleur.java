package org.ye.CalculServeur;

import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.math.BigInteger;

@Controller
public class Controlleur {
    @Autowired
    public Service service;
    @GetMapping("/fibo/{num}")
    public @ResponseBody BigInteger trucs(@PathVariable String num)  {
        return service.fibonacci(Integer.valueOf(num));
    }
    @GetMapping("/exam/h25/{nom}")
    public @ResponseBody ResponseEntity<String> bonjour(@PathVariable String nom){
        if (nom.length() > 2){
            return ResponseEntity.status(HttpStatus.OK).body("Bonjour "+ nom) ;
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Mot trop court!");
        }
    }

}
