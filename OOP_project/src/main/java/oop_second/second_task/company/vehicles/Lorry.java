package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;

public class Lorry extends Car{
    int carrying;

    public Car build(){
        return new carBuilder()
                .useMarka("РосСельМаш")
                .useCarClass("Грузовая")
                .useCarWeight(6.0)
                .useDriver(new Driver("Johnny Картошкокопатель", 40, 20))
                .useEngine(new Engine(30, "Бульдозер"))
                .setCarrying(40)
                .build();
    }
}
