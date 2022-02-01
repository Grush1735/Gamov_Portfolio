package oop_second.second_task.company.workers;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private int age;
    public String fullName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

   //Можно было бы реализовать через HashMap, но я уже не успеваю и потратил кучу времени на это ДЗ, поэтому пусть будет только 1 Person
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

}
