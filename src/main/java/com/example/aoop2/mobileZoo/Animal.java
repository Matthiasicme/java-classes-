package com.example.aoop2.mobileZoo;

import java.util.ArrayList;
import java.util.List;

//POJO - plain old java object :V
public class Animal {
    public static List<Animal> savedAnimals = new ArrayList<>();
    public String specie;
    public String name;
    public Long animal_id;
    public Boolean alive;

    public Animal(String specie, String name, Boolean alive) {
        this.specie = specie;
        this.name = name;
        this.alive = alive;
    }

public Animal(){}

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", name='" + name + '\'' +
                ", alive=" + alive +
                '}';
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Long getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(Long animal_id) {
        this.animal_id = animal_id;
    }
}
