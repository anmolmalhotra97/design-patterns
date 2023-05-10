package com.patterns.builder.car_production_example.builders;

import com.patterns.builder.car_production_example.cars.CarType;
import com.patterns.builder.car_production_example.components.Engine;
import com.patterns.builder.car_production_example.components.GPSNavigator;
import com.patterns.builder.car_production_example.components.Transmission;
import com.patterns.builder.car_production_example.components.TripComputer;

public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
