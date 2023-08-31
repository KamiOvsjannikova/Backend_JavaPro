package Homework_28_08;

//Найти среднее арифметическое положительных элементов массива.
public class Average {
    public static void main(String[] args) {
        int arr [] = {1, -5, 3, 6, -4};
        double average =  0;
        if (arr.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                 sum += arr[i];
            }
            average = sum / arr.length;
        }
        System.out.println("Среднее арифметическое положительных элементов: " + average);
    }
}
