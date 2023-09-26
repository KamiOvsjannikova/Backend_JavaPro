import java.util.Random;
import java.util.Scanner;

//Напишите программу «Средняя оценка».
//Пользователь ставит оценку от 0 до 100. Программа ставит свою оценку случайным образом, а затем выводит, среднее значение из двух оценок.
public class SchoolMark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark = scan.nextInt();// soxranitj peremennuju

        Random ran = new Random(); //programma svoju ocenku dolzna datj
        int compMark = ran.nextInt(101); //verxnaja granica ocenka ot comp
        System.out.println(compMark);
        System.out.println("Average value:");//srednee znachenie ocenok
        int average = (mark + compMark) / 2; // eto ko 2-oj zadache
        //System.out.println((mark+compMark)/2);
        System.out.println(average);
//Дополните программу «Средняя оценка».
//Выведите фразу: Have I passed the exam?
//В случае когда, средняя оценка больше 30 или пользователь ввёл оценку ниже 0, выведите false.
//В случае когда, средняя оценка больше 50 и оценка компьютера при этом больше оценки пользователя, выведите true.
        System.out.println("Have I passed the exam?");
        System.out.println(!(average > 30 || mark < 0));
        System.out.println((average > 50 && compMark > mark));
//Дополните программу «Средняя оценка».
//Если пользователь набрал меньше 33 баллов,  то вывести оценку 2.
//Если пользователь набрал от 33 до 66 баллов,  то вывести оценку 3.
//Если пользователь набрал от 66 до 80 баллов,  то вывести оценку 4.
//Если пользователь набрал больше 80 баллов,  то вывести оценку 5.
        int fivePoint = 1;// ocenka po 5 bal.wkale (k zadache 4)
        System.out.println("Your Mark is: ");
        if (average < 33) {
            fivePoint = 2; //System.out.println(2); //k zadache 3
        }
        if (average >= 33 && average < 66) {
            fivePoint = 3;  //System.out.println(3);
        }
        if (average >= 66 && average < 80) {
            fivePoint = 4; //System.out.println(4);
        }
        if (average >= 80) {
            fivePoint = 5; //System.out.println(5);
        }
//Дополните программу «Средняя оценка».
//Назначьте оценке пользователя слово, описывающее оценку:
//2 – неуд.
//3 – удов.
//4 - хорошо
//5 – отлично.
//Выведите слово в консоль.
        String markName = switch (fivePoint) {
            case 2 -> "Unsatisfactory";
            case 3 -> "Satisfactory";
            case 4 -> "Good";
            case 5 -> "Very well";
            default -> "Unknown mark";
        };
        System.out.println(markName);
//Дополните программу «Средняя оценка».
//Создайте перечисление оценок по американской системе (A, B, C ,D, E, F).
// Назначьте каждой оценке пятибалльной системы одно из значений американской системы оценок.
//0 – F
//1 – E
//2 – D
//3 – C
//4 – B
//5 – A.
//Затем по полученной оценке американской системы, используя switch, выведите «pass», когда оценка равна A, B или C.
// Выведите «fail», когда оценка D. Выведите «no data», когда оценка E или F.
        AmericanMarks amark = switch (fivePoint) {
            case 0 -> AmericanMarks.F;
            case 1 -> AmericanMarks.E;
            case 2 -> AmericanMarks.D;
            case 3 -> AmericanMarks.C;
            case 4 -> AmericanMarks.B;
            default -> AmericanMarks.A;
        };
        System.out.println(amark);
        String result = switch (amark) { // Выведите «fail», когда оценка D. Выведите «no data», когда оценка E или F.
            case A, B, C -> "pass";
            case D -> "fail";
            case E, F -> "no data";
        };
        System.out.println(result);
//Пользователь вводит порядковый номер месяца. Если введён неправильный номер, повторите запрос ввода номера месяца (do-while).
//Используя enum Month из пакета java.time, выведите в консоль имена месяцев от January до месяца, введённого пользователем включительно (for).
//Выведите в консоль все месяцы, кроме того, который указал пользователь (foreach).

    }
}