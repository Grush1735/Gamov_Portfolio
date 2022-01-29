package oop_second.first_task;

public abstract class Animal {
    String food;
    String location;
    String animalName;

    public Animal(String food, String location, String animalName){
        this.food = food;
        this.location = location;
        this.animalName = animalName;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();
}
