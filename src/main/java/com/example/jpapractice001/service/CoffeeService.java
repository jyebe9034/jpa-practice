package com.example.jpapractice001.service;

import com.example.jpapractice001.domain.Coffee;
import com.example.jpapractice001.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepository repository;

    public void insert(Coffee coffee) {
        repository.save(coffee);
    }

    public void updateById(Coffee coffee) {
        Coffee original = repository.findById(coffee.getId()).get();
        original.setName(coffee.getName());
        original.setPrice(coffee.getPrice());

        repository.save(original);
    }

    public Coffee selectOne(Long id) {
        return repository.findById(id).get();
    }

    public List<Coffee> selectAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
