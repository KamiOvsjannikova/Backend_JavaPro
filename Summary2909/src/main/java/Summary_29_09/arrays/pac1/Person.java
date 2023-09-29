package Summary_29_09.arrays.pac1;

public class Person {
    private String name;
    private int age;
    private String address;
    private String password;

    public void printPerson(){}

    public boolean isPasswordCorrect(String inputUserPassword){
        boolean isCorrect = password.equals(inputUserPassword);
        return isCorrect;
    }

    public Person(String name, int age, String address, String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;
    }

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String password) {
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, double ageCondition) {
        if (age > ageCondition) {
            this.age = age;}
    }

    public void personBirthday(){
        age++;
    }
}
