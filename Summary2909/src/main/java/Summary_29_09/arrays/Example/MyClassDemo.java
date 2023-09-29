package Summary_29_09.arrays.Example;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(1, "text1");

        System.out.println(myClass1);

        MyClass myClass2 = new MyClass(2);
        System.out.println(myClass2);

        MyClass myClass3 = new MyClass(myClass1);
        System.out.println(myClass3);
    }
}
