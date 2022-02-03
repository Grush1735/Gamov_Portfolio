package oop_second.second_task.company.professions;

import oop_second.second_task.company.workers.Person;

public class Driver extends Person {

    int experience;

    public Driver(String fullName, int age, int experience){
        super(fullName, age);
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
