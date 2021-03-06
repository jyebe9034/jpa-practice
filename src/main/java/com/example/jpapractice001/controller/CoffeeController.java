package com.example.jpapractice001.controller;

import com.example.jpapractice001.domain.Coffee;
import com.example.jpapractice001.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService service;

    @PostMapping("/insert")
    public void insertCoffee(@RequestBody Coffee coffee) {
        service.insert(coffee);
    }

    @PutMapping("/update")
    public void updateCoffee(@RequestBody Coffee coffee) {
        service.updateById(coffee);
    }

    @GetMapping("/selectById/{id}")
    public ResponseEntity<Coffee> selectCoffeeById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.selectOne(id));
    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<Coffee>> selectAll() {
        return ResponseEntity.ok(service.selectAll());
    }

    @DeleteMapping("{id}")
    public void deleteCoffee(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
