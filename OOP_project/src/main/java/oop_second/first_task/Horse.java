package oop_second.first_task;

public class Horse extends Animal{

    private final String name = "Лошадь";
    private String food;
    private String location;

    public Horse (String food, String location){
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
        System.out.printf("%s фырчит", name);
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
