package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonInfo {
    Random rand = new Random();
    private final List<Person> personList = new ArrayList<>();


    public void createList() {
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            String[] names = {"James", "Oleg", "John", "Emma", "Shawn", "Henry", "Dan", "Sam", "Michael", "Robert", "Bruce"};
            String name = names[rand.nextInt(names.length)];
            String[] lastNames = {"Brown", "Davis", "Johnson", "Jones", "Miller", "Smith", "Williams", "Wilson"};
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            personList.add(person);
            person.setName(name);
            person.setLastName(lastName);
            person.setAge(rand.nextInt(100));

            if (person.getAge() <= 1) {
                person.setWeight(Math.round(rand.nextDouble(2.8) + 8.6));
                person.setHeight(Math.round(rand.nextDouble(4) + 72));
            } else if (person.getAge() == 2) {
                person.setWeight(Math.round(rand.nextDouble(3) + 10.8));
                person.setHeight(Math.round(rand.nextDouble(3) + 87));
            } else if (person.getAge() == 3) {
                person.setWeight(Math.round(rand.nextDouble(4) + 12.7));
                person.setHeight(Math.round(rand.nextDouble(4) + 88));
            } else if (person.getAge() <= 5) {
                person.setWeight(Math.round(rand.nextDouble(5) + 16));
                person.setHeight(Math.round(rand.nextDouble(6) + 100));
            } else if (person.getAge() <= 7) {
                person.setWeight(Math.round(rand.nextDouble(6.4) + 20));
                person.setHeight(Math.round(rand.nextDouble(7) + 114));
            } else if (person.getAge() <= 10) {
                person.setWeight(Math.round(rand.nextDouble(11) + 26.7));
                person.setHeight(Math.round(rand.nextDouble(12) + 118));
            } else if (person.getAge() <= 12) {
                person.setWeight(Math.round(rand.nextDouble(9) + 36));
                person.setHeight(Math.round(rand.nextDouble(24) + 130));
            } else if (person.getAge() <= 16) {
                person.setWeight(Math.round(rand.nextDouble(8) + 1));
                person.setHeight(Math.round(rand.nextDouble(30) + 150));
            } else if (person.getAge() <= 99) {
                person.setWeight(Math.round(rand.nextDouble(40) + 45));
                person.setHeight(Math.round(rand.nextDouble(45) + 150));
            }

        }

    }

    public void printList() {
        System.out.println(personList.toString());
    }


}
