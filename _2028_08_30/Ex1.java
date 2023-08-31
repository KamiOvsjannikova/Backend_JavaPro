package _2028_08_30;

public class Ex1 {   //extends Object// NASLEDOVANIE{ //verhne urovnivij class po umolchaniju Object on nasledujetsja dalwe

    static String smyh; // kuda obrawaemsja
    int age;// nelza prosto obratitsja. Tolko sozdatj class

    //vsjo chto viwe eto nassledovanie, a vsjo chto nize polimorfizm (rezultat)
    @Override
    public String toString() {
        return "****Ex1: [" + age + "]****"; // eto budet vigladetj v raspechatke

       // return "Ex1{" +
               // "age=" + age +
               // '}';
    }

    public static void main(String[] args) { //piwem na pramuju
       // new Ex1(). // vse class nasledujutsja ot oject
        System.out.println(new Ex1());
    }
}
