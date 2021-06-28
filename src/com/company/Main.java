package com.company;

public class Main {

    public static void main(String[] args) {
	/* Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
        порядке (99 97 95 93 … 7 5 3 1)

} */
        int arr[] = new int[100];
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 99; i > 0; i -= 2) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }
}

