package com.example.jpapractice001.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "coffee")
@Data
public class Coffee {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

    private int price;
}
