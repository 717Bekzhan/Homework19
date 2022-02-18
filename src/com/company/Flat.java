package com.company;

import java.util.Arrays;

public class Flat implements comService{
    private String adress;
    Person[]people;

    public Flat() {
    }

    public Flat(String adress, Person[] people) {
        this.adress = adress;
        this.people = people;
    }

    @Override
    public void pay() {
        System.out.println(new Person("Bek") + " paying com services");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "adress='" + adress + '\'' +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}

