package oop_second.first_task;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog("Сухой корм для собак", "Большая клетка для собак");
        Animal cat = new Cat("Сухой корм для котов", "Маленькая клетка для котов");
        Animal horse = new Horse("Овес для лошадей", "Загон для лошадей");

        Animal[] animals = new Animal[]{dog, cat, horse};

        for (int i = 0; i < 3; i++){
            Vet.treatAnimal(animals[i]);
        }
    }
}
