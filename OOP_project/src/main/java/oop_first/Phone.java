package oop_first;

public class Phone {

    int number;
    String model;
    double weight;

    public Phone(int number,
                 String model,
                 double weight){
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number,
                 String model){
        this.number = number;
        this.model = model;
    }

    Phone(){

    }

    static void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, int number){

    }

    public int getNumber(){
        return number;
    }

    void sendMessage(int ... numbers){
        for (int number: numbers) {
            System.out.print(number);
        }
    }

    public static void main(String[] args){
        Phone android = new Phone();
        Phone iOS = new Phone();
        Phone windows = new Phone();
        android.receiveCall("Vlad");
        android.getNumber();
        iOS.receiveCall("Vlad");
        iOS.getNumber();
        windows.receiveCall("Vlad");
        windows.getNumber();

        System.out.print(android.number + ' ' + android.model + ' ' + android.weight);
        System.out.print(iOS.number + ' ' + iOS.model + ' ' + iOS.weight);
        System.out.print(windows.number + ' ' + windows.model + ' ' + windows.weight);

        receiveCall("Vlad");
    }




}
