package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class GodgoController {

    private List<Godjo> godjoList = new ArrayList<>();

    @GetMapping("/godjo")
    public List<Godjo> getGobjo() {
        return godjoList;
    }

    @PostMapping("/godjo")
    public void ingodjo(@RequestBody Godjo godjo) {
        godjoList.add(godjo);
    }

    @GetMapping("/random")
    public Integer getRandomNumber() {
        Random random = new Random();

        // число от 0 до 99
        int num = random.nextInt(100);

        return num;
    }

}
