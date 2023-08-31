package Homework_28_08;

//Найти в массиве наибольшую сумму подряд идущих элементов
public class SumMax {
    public static void main(String[] args) {
        int arr [] = {1, -2, 3, 4 ,-5, 2, -3, 6, -4, -6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] > max) max = arr[i] + arr[i + 1];
        }
        System.out.println("Наибольшая сумма подряд идущих элементов: " + max);
    }
}
