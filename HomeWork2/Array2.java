package HomeWork.HomeWork2;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int[] arrays = {1,-33,656,33,544,89,43,-39,-65};
            compressAndRemoveElements(arrays, 22,-40);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){               //task 2.3
        Random random = new Random();
        int[] container = new int[size];
        for(int i = 0; i<size; i++){
        container[i] = random.nextInt(maxValueExclusion);
        }
        for(int i=0; i<size; i++){
            System.out.print(container[i] +" ");
        }
        return container;
    }

    public static int[] evenAndPositive(int[] array){                               //task 2.4.1
        for(int i = 0; i<array.length; i++){
            if(array[i] % 2 == 0 && array[i] > 0){
                System.out.print(array[i] + " ");
            }
        }
        return array;
    }

    public static int[] maxEvenIndex(int[] array){                                  //task 2.4.2
        int count = 2;
        int max = 0;
        while (count < array.length){
            if(array[count] > array[max]){
                max = count;
            }
            count +=2;
        }
        System.out.println(max + ": " + array[max]);
        return array;
    }

    public static void lessThanArithmeticMean(int[] array){                         //task 2.4.3
        int sum = 0;
        double arithmeticSum = 0;
        for(int count : array){
            sum += count;
        }
        arithmeticSum = sum / array.length;
        for(int i = 0; i<array.length; i++){
            if(array[i] < arithmeticSum){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void smallastElements(int[] array){                               //task 2.4.4
        int min1 = 0;
        int min2 = 0;
        int bi = 0;
        if(array[0] < array[1]){
            min1 = 0;
            min2 = 1;
        }else {
            min1 = 1;
            min2 = 0;
        }
        for(int i = 2; i < array.length; i++){
            if(array[i] < array[min1]){
                bi = min1;
                min1 = i;
                if(array[bi] < array[min2]){
                    min2 = bi;
                }
            }else {
                if(array[i] < array[min2]){
                    min2 = i;
                }
            }
        }
        System.out.println(array[min1]);
        System.out.println(array[min2]);
    }

    public static int[] compressAndRemoveElements(int[] array, int intervalA, int intervalZ){               //task 2.4.5
        int length = array.length;
        int i = 0;
        int j ;
        while (i < length){
            if(array[i] <= intervalA && array[i] >= intervalZ) {
                length -= 1;
                for ( j = i; j < length; j++) {
                    array[j] = array[j + 1];
                }
            }else
                i += 1;
        }
        for(i = length; i<length; i++){
            array[i] = 0;
        }
        for( i = 0;  i<length; i++){
            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static int[] sumOfDigits(int[] array){                       //task 2.4.6
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = array[i];
            while (counter > 0){
                summ += counter%10;
                counter /= 10;
            }
        }
        System.out.println(summ);
        return array;
    }

}
