package org.company;

public class Main {

    public static void main(String[] args) {

        Person[] people = {new Person("John", "Snow", 42),
            new Person("Tirion", "Lanister", 50),
            new Person("Ned", "Stark", 60)};

        for (int i = 0; i < people.length; i++) {
            if (people[i].age >= 50) {
                System.out.println(people[i]);
            }
        }


    }
}
