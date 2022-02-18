package com.company;

import java.util.Arrays;

public class HostelForStudents implements Arenda {
    private String adress;
    Person[]people;

    public HostelForStudents() {
    }

    public HostelForStudents(String adress, Person[] people) {
        this.adress = adress;
        this.people = people;
    }
    @Override
    public void pay() {
        System.out.println("students paying arenda");
    }

    @Override
    public String toString() {
        return "HostelForStudents{" +
                "adress='" + adress + '\'' +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
