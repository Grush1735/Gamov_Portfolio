package oop_second.first_task;

public class Vet {

    static String food;
    static String animalName;
    static String location;

    public static void treatAnimal(Animal animal){
        System.out.printf("Дайте %s %s", animalName, food);
        System.out.printf("Данный %s живет в %sе", animalName, location);
        System.out.println();
    }


}
