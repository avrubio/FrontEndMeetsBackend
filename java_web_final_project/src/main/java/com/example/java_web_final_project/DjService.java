package com.example.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DjService {

    private final DjRepository djRepository;

    public DjService(DjRepository djRepository){
        this.djRepository = djRepository;
    }

    public List<Dj> all() {
        return djRepository.findAll();
    }

    public void add(Dj dj) {
        djRepository.save(dj);
    }
}
