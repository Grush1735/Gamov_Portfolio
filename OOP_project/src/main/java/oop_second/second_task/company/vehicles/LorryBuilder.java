package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;

public class LorryBuilder implements carBuilder{

    Car lorry = new Car();
    @Override
    public LorryBuilder useMarka(String marka) {
        lorry.setMarka(marka);
        return this;
    }

    @Override
    public LorryBuilder useCarClass(String carClass) {
        lorry.setCarClass(carClass);
        return this;
    }

    @Override
    public LorryBuilder useCarWeight(double carWeight) {
        lorry.setCarWeight(carWeight);
        return this;
    }

    @Override
    public LorryBuilder useDriver(Driver driver) {
        lorry.setDriver(driver);
        return this;
    }

    @Override
    public LorryBuilder useEngine(Engine engine) {
        lorry.setEngine(engine);
        return this;
    }

    public LorryBuilder setCarrying(int carrying){
        lorry.setCarrying(carrying);
        return this;
    }

    public Car build() {
        return lorry;
    }
}
