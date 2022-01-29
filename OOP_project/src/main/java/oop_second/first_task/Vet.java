package oop_second.first_task;

public class Vet {

    String food;
    String animalName;
    String location;

    public void treatAnimal(Animal animal){
        System.out.printf("Дайте %s %s", animalName, food);
        System.out.printf("Данный %s живет в %sе", animalName, location);
    }


}
