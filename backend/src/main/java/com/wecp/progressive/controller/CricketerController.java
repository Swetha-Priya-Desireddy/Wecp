
package com.wecp.progressive.controller;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
import com.wecp.progressive.service.impl.CricketerServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/cricketers")
public class CricketerController {
    @Autowired
    private CricketerServiceImplJpa cricketerServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Cricketer>> getAllCricketers() {
        try{
            return ResponseEntity.ok(cricketerServiceImplJpa.getAllCricketers());
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cricketer> getCricketerById(@PathVariable int id) {
        try{
            return ResponseEntity.ok(cricketerServiceImplJpa.getCricketerById(id));
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        
    }

    @PostMapping
    public ResponseEntity<Integer> addCricketer(@RequestBody Cricketer cricketer) {
        try{
            return new ResponseEntity<>(cricketerServiceImplJpa.addCricketer(cricketer),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCricketer(@PathVariable int id, @RequestBody Cricketer cricketer) {
        try
        {
            cricketer.setCricketerId(id);
            cricketerServiceImplJpa.updateCricketer(cricketer);
            return ResponseEntity.ok().build();
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCricketer(@PathVariable int id) {
        try{
            cricketerServiceImplJpa.deleteCricketer(id);
            return ResponseEntity.noContent().build();

        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
       
    }

    @GetMapping("/team/{teamId}")
    public ResponseEntity<List<Cricketer>> getCricketersByTeam(@PathVariable int teamId) {
        try
        {
            return ResponseEntity.ok(cricketerServiceImplJpa.getCricketersByTeam(teamId));
        }
        catch(Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
}
