package oop_second.second_task.company;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;
import oop_second.second_task.company.vehicles.Car;
import oop_second.second_task.company.vehicles.LorryBuilder;
import oop_second.second_task.company.vehicles.SportCarBuilder;

public class Application {
    public static void main(String[] args) {

        Car sportCar = new SportCarBuilder()
                .useMarka("Маруся")
                .useCarClass("Спортивная")
                .useCarWeight(3.5)
                .useDriver(new Driver("Johnny Batony", 25, 2))
                .useEngine(new Engine(15, "Katana"))
                .setSportSpeed(220)
                .build();

        System.out.println(sportCar.toString());

        Car lorryCar = new LorryBuilder()
                .useMarka("РосСельМаш")
                .useCarClass("Грузовая")
                .useCarWeight(6.0)
                .useDriver(new Driver("Johnny Картошкокопатель", 40, 20))
                .useEngine(new Engine(30, "Бульдозер"))
                .setCarrying(40)
                .build();

        System.out.println(lorryCar.toString());
    }
}
