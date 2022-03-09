package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.professions.Driver;
import oop_second.second_task.company.details.Engine;

public class SportCarBuilder implements carBuilder {

    Car sportCar = new Car();

    @Override
    public SportCarBuilder useMarka(String marka) {
        sportCar.setMarka(marka);
        return this;
    }

    @Override
    public SportCarBuilder useCarClass(String carClass) {
        sportCar.setCarClass(carClass);
        return this;
    }

    @Override
    public SportCarBuilder useCarWeight(double carWeight) {
        sportCar.setCarWeight(carWeight);
        return this;
    }

    @Override
    public SportCarBuilder useDriver(Driver driver) {
        sportCar.setDriver(driver);
        return this;
    }

    @Override
    public SportCarBuilder useEngine(Engine engine) {
        sportCar.setEngine(engine);
        return this;
    }

    public SportCarBuilder setSportSpeed(double speed){
        sportCar.setSpeed(speed);
        return this;
    }

    public Car build() {
        return sportCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + sportCar.getMarka() + '\'' +
                ", carClass='" + sportCar.getCarClass() + '\'' +
                ", carWeight=" + sportCar.getCarWeight() +
                ", driver=" + sportCar.getDriver().toString() +
                ", engine=" + sportCar.getEngine().toString() +
                ", speed=" + sportCar.getSpeed() +
                '}';
    }
}
