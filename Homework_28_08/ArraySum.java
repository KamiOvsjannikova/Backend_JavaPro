package Homework_28_08;

//Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
public class ArraySum {
    public static void main(String[] args) {
        int arr [] = {2,3,9,15,9,6,21,3};
                int sum = 0;
        for (int i = 0; i > 0; i++ ) {
            if ( arr [i] % 3 == 0 &&  arr [i] % 5 != 0) {
                sum += arr [i];
            }
        }
        System.out.println("Сумма элементов, которые делятся на 3 и не делятся на 5: " + sum);
    }
}
