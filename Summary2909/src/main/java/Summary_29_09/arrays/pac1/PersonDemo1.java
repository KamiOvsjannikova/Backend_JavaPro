package Summary_29_09.arrays.pac1;

public class PersonDemo1 {
    public static void main(String[] args) {
        Person person = new Person("Ruslan", 31,"Riga","12345");
        // System.out.println(person);
        person.isPasswordCorrect("23456789");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());

        person.setAddress("Berlin");
        person.personBirthday();

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());



        person.setAge(21,18);
    }
}
