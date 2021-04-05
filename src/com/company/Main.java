package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {2.3, -5.1, 1.3, -6.3, -2.4, -3.5, 1.7, 4.6,
                7.6, 3.5, -5.8, -7.7, -23.5, -34.4, 56.3};

        System.out.println("первое отрицательное число:" + negativ(numbers));
        System.out.println("по возрастанию" + bubbleSort(int[]));



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

     public static void bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
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
