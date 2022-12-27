package org.company;

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person() {
        this(27);
        System.out.println("Hello world!");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;  // new Person().firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printPersonInfo() {
        System.out.println(firstName + ", " + lastName + ", " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            '}';
    }
}
