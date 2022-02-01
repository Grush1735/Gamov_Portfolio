package oop_second.second_task.company.vehicles;

import oop_second.second_task.company.details.Engine;
import oop_second.second_task.company.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private double carWeight;
    private Driver driver;
    private Engine engine;
    private double speed;
    private int carrying;

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public String getMarka() {
        return marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getSpeed() {
        return speed;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight +
                ", driver=" + driver +
                ", engine=" + engine;
    }
}
