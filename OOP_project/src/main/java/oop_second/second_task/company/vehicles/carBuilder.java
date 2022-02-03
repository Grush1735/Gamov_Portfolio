package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;

public  class carBuilder {

    Car car = new Car();

    public carBuilder useMarka(String marka){
        car.setMarka(marka);
        return this;
    }

    public carBuilder useCarClass(String carClass){
        car.setCarClass(carClass);
        return this;
    }

    public carBuilder useCarWeight(double carWeight){
        car.setCarWeight(carWeight);
        return this;
    }

    public carBuilder useDriver(Driver driver){
        car.setDriver(driver);
        return this;
    }

    public carBuilder useEngine(Engine engine){
        car.setEngine(engine);
        return this;
    }

    public carBuilder setSportSpeed(double speed){
        car.setSpeed(speed);
        return this;
    }

    public carBuilder setCarrying(int carrying) {
        car.setCarrying(carrying);
        return this;
    }

    public Car build(){
        return car;
    }


}
