package com.vermeg.dependencymanagement.controller;


import com.vermeg.dependencymanagement.entity.Application;
import com.vermeg.dependencymanagement.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Devops", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AppController {

    @Autowired
    private AppRepository appRepository;

    @GetMapping(value = "/app/{id}",consumes = {MediaType.ALL_VALUE})
    public Application getApp(@PathVariable Long id) {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return appRepository.findById(id).get();
    }

    @GetMapping("/apps")
    public List<Application> getApps() {
        return (List<Application>) appRepository.findAll();

    }

    @DeleteMapping("/app/{id}")
    public boolean deleteApp(@PathVariable long id) {
        appRepository.deleteById((long) id);

        return true;
    }


    @PostMapping("/app")
    public Application createApp(@RequestBody Application app) {
        return appRepository.save(app);

    }

    @PutMapping("/app")
    public Application updateApp(@RequestBody Application app) {
        return appRepository.save(app);

    }
}
