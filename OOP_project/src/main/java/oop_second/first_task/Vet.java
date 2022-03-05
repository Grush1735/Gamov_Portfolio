package oop_second.first_task;

public class Vet {
    static void treatAnimal(Animal animal){
        String food = animal.getFood();
        String name = animal.getName();
        System.out.printf("Принести %s для %s", food, name);
        System.out.println();
    }
}
