package com.patterns.factory.animal_example;

public class AnimalFactory {

    private Animal animal = null;

    public Animal getAnimal(String animalType) {
        if ("dog".equals(animalType))
            animal = new Dog();
        else if ("cat".equals(animalType))
            animal = new Cat();
        return animal;
    }
}
