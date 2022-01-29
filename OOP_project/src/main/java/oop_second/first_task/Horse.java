package oop_second.first_task;

public class Horse extends Animal{

    boolean bytes;

    public Horse(String food, String location, String animalName, boolean bytes) {
        super(food, location, animalName);
        this.bytes = bytes;
    }


    @Override
    public void makeNoise(){
        System.out.println(animalName + " спит");
    }

    @Override
    public void eat(){
        System.out.println("Кормим " + animalName + ' ' + food);
    }

    @Override
    public void sleep() {
        System.out.println("Укладываем " + animalName + " спать");
    }
}
