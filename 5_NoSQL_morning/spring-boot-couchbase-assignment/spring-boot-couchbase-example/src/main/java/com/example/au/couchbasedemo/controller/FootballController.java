package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Football;
import com.example.au.couchbasedemo.repository.FootballRepository;

@RestController
public class FootballController {
	@Autowired
	FootballRepository footballRepository;
	
	@PostMapping("/Football")
    public Football addPlayer(@RequestBody Football newentry) {
        return footballRepository.save(newentry);
    }
    
    @GetMapping("/Football/{id}")
    public Optional<Football> getPlayerById(@PathVariable String id) {
        if (footballRepository.existsById(id)) {
            return footballRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/Football/pn/{playername}")
    public Football getPlayerByName(@PathVariable String playername) {
         return footballRepository.findByPlayername(playername);
    }
    
    @DeleteMapping("/Football/{id}")
    public String deleteById(@PathVariable String id) {
        footballRepository.deleteById(id);
        return "Successfully deleted...";
    }
    
    @GetMapping("/Football/goals/{goal}")
    public List<Football> getPlayerWithGoalsMoreThan(@PathVariable int goal) {
        List<Football> playerList = new ArrayList<>();
        footballRepository.findAll().forEach(Football -> {
            int numberOfGoals = Football.getTotalgoals();
            if (numberOfGoals >= goal) {
                playerList.add(Football);
            }
        });

        return playerList;
    }
	
	
}
