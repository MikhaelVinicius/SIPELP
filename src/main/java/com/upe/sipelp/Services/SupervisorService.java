package com.upe.sipelp.Services;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upe.sipelp.Repositorios.SupervisorRepository;
import com.upe.sipelp.Entidades.Supervisor;

@Service 
public class SupervisorService {

    @Autowired
    private SupervisorRepository repository;

    public List<Supervisor> findAll() {
        return repository.findAll();
    }
}
