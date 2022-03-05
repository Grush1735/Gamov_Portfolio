package oop_second.first_task;

public class Dog extends Animal{

    private final String name = "Собака";
    private String food;
    private String location;

    public Dog (String food, String location){
        this.food = food;
        this.location = location;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeNoise(){
        System.out.printf("%s гавкает", name);
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
