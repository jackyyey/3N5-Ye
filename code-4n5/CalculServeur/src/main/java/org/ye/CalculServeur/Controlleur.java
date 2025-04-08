package org.ye.CalculServeur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;

@Controller
public class Controlleur {
    @Autowired
    public Service service;
    @GetMapping("/fibo/{num}")
    public @ResponseBody BigInteger trucs(@PathVariable String num)  {
        return service.fibonacci(Integer.valueOf(num));
    }

}
