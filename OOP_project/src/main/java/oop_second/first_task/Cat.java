package oop_second.first_task;

public class Cat extends Animal{

    boolean meows;
    boolean scared;

    public Cat(String food, String location, String animalName, boolean meows, boolean scared) {
        super(food, location, animalName);
        this.meows = meows;
        this.scared = scared;
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
