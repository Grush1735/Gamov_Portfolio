package oop_second.first_task;

public class Dog extends Animal {

    boolean aggressive;
    int barksCount;

    public Dog(String food, String location, String animalName, boolean aggressive, int barksCount) {
        super(food, location, animalName);
        this.aggressive = aggressive;
        this.barksCount = barksCount;
    }

    @Override
    public void makeNoise() {
        System.out.println(animalName + " спит");
    }

    @Override
    public void eat() {
        System.out.println("Кормим " + animalName + ' ' + food);
    }

    @Override
    public void sleep() {
        System.out.println("Укладываем " + animalName + " спать");
    }
}
