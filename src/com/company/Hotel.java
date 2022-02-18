package com.company;

import java.util.Arrays;

public class Hotel implements Arenda{
    private String adress;
    Person[]people;

    public Hotel() {
    }

    public Hotel(String adress, Person[] people) {
        this.adress = adress;
        this.people = people;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public void pay() {
        System.out.println("people paying arenda");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "adress='" + adress + '\'' +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
