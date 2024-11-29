package ec.edu.espe.msmaster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/master")
public class Master {

    @GetMapping("/")
    public String hola() {
        return "hola";
    }

}
