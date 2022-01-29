package oop_second.first_task;

public class Application {

    public static void main(String[] args){
        Dog dog = new Dog("влажный корм для собак", "город", "Собака", false, 3);
        Cat cat = new Cat("влажный корм для котов", "деревн", "Кот", true, true);
        Horse horse = new Horse("Овес", "загон", "Конь", true);

        Animal[] animal = new Animal[]{dog, cat, horse};

        for (int i = 0; i < 3; i++){
            Vet.treatAnimal(animal[i]);
        }
    }

}
