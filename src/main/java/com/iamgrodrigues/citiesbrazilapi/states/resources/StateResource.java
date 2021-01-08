package com.iamgrodrigues.citiesbrazilapi.states.resources;

import com.iamgrodrigues.citiesbrazilapi.states.entities.State;
import com.iamgrodrigues.citiesbrazilapi.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}
