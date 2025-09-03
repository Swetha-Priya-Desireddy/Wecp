
package com.wecp.progressive.controller;
import com.wecp.progressive.entity.Cricketer;
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

    @GetMapping
    public ResponseEntity<List<Cricketer>> getAllCricketers() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cricketer> getCricketerById(@PathVariable int id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Integer> addCricketer(@RequestBody Cricketer cricketer) {
        return ResponseEntity.ok(0);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCricketer(@PathVariable int id, @RequestBody Cricketer cricketer) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCricketer(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/team/{teamId}")
    public ResponseEntity<List<Cricketer>> getCricketersByTeam(@PathVariable int teamId) {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
