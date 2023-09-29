package _28_09_2023.person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Person vasja = new Person();
//
//        vasja.id = 1;
//        vasja.firstName = "Vasja";
//        vasja.lastName = "Pupkin";
//        vasja.dateOfBirth = LocalDate.of(1995, 8, 13);
//        vasja.nim = 12345L;
//        vasja.gender = Gender.MALE;
//
//        System.out.println(vasja.lastName);
//
//        Person irina = new Person();
//
//        irina.id = 2;
//        irina.firstName = "Irina";
//        irina.lastName = "Kuzina";
//        irina.dateOfBirth = LocalDate.of(1985, 9, 7);
//        irina.nim = 15685L;
//        irina.gender = Gender.FEMALE;
//
//        System.out.println(irina.lastName);


        // В созданном классе Person
        // сделайте поля приватными и добавьте методы доступа с соответствующими проверками.

        Person dima = new Person();
        dima.setId(45);
        System.out.println(dima.getId());
    }
}

