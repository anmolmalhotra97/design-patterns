package com.patterns.builder.car_production_example.client_code;

import com.patterns.builder.car_production_example.cars.*;
import com.patterns.builder.car_production_example.director.Director;
import com.patterns.builder.car_production_example.builders.*;


/**
 * Demo class.
 */
public class DemoApp {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        // Director may know several building recipes.

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
