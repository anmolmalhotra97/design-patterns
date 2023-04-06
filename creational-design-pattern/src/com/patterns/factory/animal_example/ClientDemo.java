package com.patterns.factory.animal_example;

public class ClientDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = null;

        /*
         * The Factory is returning Object of Type Dog or Cat based on the requirement.
         * client doesnt care about how speaks is implemented.
         * client can directly call it on all the objects.
         */
        animal = animalFactory.getAnimal("dog");
        System.out.println("Animal action: " + animal.speaks());

        animal = animalFactory.getAnimal("cat");
        System.out.println("Animal action: " + animal.speaks());
    }
}
