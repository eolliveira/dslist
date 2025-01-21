package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> findAll() {
        return repository.findAll();
    }

}
