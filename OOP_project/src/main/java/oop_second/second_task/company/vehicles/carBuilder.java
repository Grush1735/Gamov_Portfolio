package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;

interface carBuilder {

    carBuilder useMarka(String marka);

    carBuilder useCarClass(String carClass);

    carBuilder useCarWeight(double carWeight);

    carBuilder useDriver(Driver driver);

    carBuilder useEngine(Engine engine);
}
