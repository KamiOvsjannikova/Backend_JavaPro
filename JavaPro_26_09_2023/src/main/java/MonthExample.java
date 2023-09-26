import java.util.Scanner;
///Пользователь вводит порядковый номер месяца. Если введён неправильный номер, повторите запрос ввода номера месяца (do-while).
//Используя enum Month из пакета java.time, выведите в консоль имена месяцев от January до месяца,
// введённого пользователем включительно (for).
//Выведите в консоль все месяцы, кроме того, который указал пользователь (foreach).
public class MonthExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user;
        do {
            System.out.println("Enter month number");
        user = scan.nextInt()  ;
        } while (user<1 || user >12 );
    }
}
