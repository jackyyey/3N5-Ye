package org.ye.CalculMethodes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
public class ExampleController {
    List<String> choses = new LinkedList<>(Arrays.asList("ff","b","c","d","e","f","g","h","i","j"));
    @GetMapping("/api/chose")
    public @ResponseBody List<String> Get(){
        return choses;
    }

    @PostMapping("/api/chose")
    public @ResponseBody List<String> Post(@RequestBody String chose){
        choses.add(chose);
        return choses;
    }

    @PutMapping("/api/chose/{id}")
    public @ResponseBody void Put(@PathVariable int id){

    }

    @DeleteMapping("/api/chose")
    public @ResponseBody List<String> Delete(){
        choses.clear();
        return choses;
    }
}
