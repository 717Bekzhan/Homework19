package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person = new Person("Bek");
        Person person1 = new Person("Almaz");
        Person person2 = new Person("Nur");
        Person person3 = new Person("Akylai");
        Person[] people = {person};
        Flat flat = new Flat("street Manas", people);
        System.out.println(flat);
        flat.pay();
        System.out.println("    ");
        Person[] people1 = {person1, person2};
        HostelForStudents hostel = new HostelForStudents("Chui 13", people1);
        System.out.println(hostel);
        hostel.pay();
        System.out.println("  ");
        Person[] people2 = {person3};
        Hotel hotel = new Hotel("Almata 78", people2);
        System.out.println(hotel);
        hotel.pay();


    }
}
