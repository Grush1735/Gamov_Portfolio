package oop_second.first_task;

public class Cat extends Animal {

    private final String name = "Кот";
    private String food;
    private String location;

    public Cat (String food, String location){
        this.food = food;
        this.location = location;
    }

    @Override
    public void makeNoise(){
        System.out.printf("%s мяукает", name);
    }

    @Override
    public void sleep(){
        System.out.printf("%s спит в %s", name, location);
    }

    @Override
    public void eat(){
        System.out.printf("%s кушает %s", name, food);
    }
}
