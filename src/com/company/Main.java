package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {2.3, -5.1, 1.3, -6.3, -2.4, -3.5, 1.7, 4.6,
                7.6, 3.5, -5.8, -7.7, -23.5, -34.4, 56.3};

        System.out.println("первое отрицательное число:" + negativ(numbers));



        int counter = 0;
        double sum = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>0){
                sum += numbers[i];
                counter++;
            }
        }




        System.out.println("количество положительных чисел, после первого отрицательного:" +counter);

        System.out.println("Среднее арифметическое: "+  sum/counter);

    }


    public static double negativ(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return array[i];
            }
        }
        return -1;
    }
}
