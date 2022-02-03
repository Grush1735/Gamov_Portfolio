package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.professions.Driver;
import oop_second.second_task.company.details.Engine;

public class SportCar extends carBuilder{

    public static Car getSportCar(){
        return new carBuilder()
                .useMarka("Маруся")
                .useCarClass("Спортивная")
                .useCarWeight(3.5)
                .useDriver(new Driver("Johnny Batony", 25, 2))
                .useEngine(new Engine(15, "Katana"))
                .setSportSpeed(220)
                .build();
    }

    SportCar sportCar = new SportCar();

    @Override
    public String toString() {
        return "SportCar{" +
                Car.toString() +
                "speed=" + Car.getSpeed() +
                '}';
    }


}
