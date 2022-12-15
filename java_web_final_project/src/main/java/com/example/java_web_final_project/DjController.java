package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/djs")
public class DjController {

    private final DjService djService;

    public DjController(DjService djService) {
        this.djService = djService;
    }

    @GetMapping
    public List<Dj> getDjs(){
        return djService.all();
    }

    @PostMapping
    public void addDj(@RequestBody Dj dj){
        djService.add(dj);
    }
}
