package oop_second.first_task;


public abstract class Animal {
    private String name;
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void eat();

    public abstract void makeNoise();

    public abstract void sleep();
}
