package _28_09_2023.person;

import java.time.LocalDate;

//Создайте класс Person для описания человека. Перечислите в нём поля Идентификатор (числовой),
// Имя, Фамилия, Дата рождения, налоговый номер (числовой), Пол
public class Person {
    private int id;
    private String firstName;//public String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private long nim;
    private Gender gender;
    public  int getId() {
        return id;
    }



    public void setId(int id) {
        if (id<0) throw new IllegalArgumentException("Id не может быть отрицательным");
        this.id = id;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getNim() {
        return nim;
    }

    public Gender getGender() {
        return gender;
    }
}
    //В созданном классе Person
// сделайте поля приватными и добавьте
// методы доступа с соответствующими проверками.