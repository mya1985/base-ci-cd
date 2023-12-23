package tech.mya.base.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "base", produces = MediaType.APPLICATION_JSON_VALUE)
public class Cicdcontroller {

    @GetMapping
    public List<Object> search(){
        return List.of(new Recordcicd(1, "belle formation", 1));
    }
}
