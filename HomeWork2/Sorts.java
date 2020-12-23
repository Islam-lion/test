package HomeWork.HomeWork2;

import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPuzyr(randomSortArray())));
    }

    public static int[] sortPuzyr(int[] array){
        int i;
        boolean chek = true;
        int temp;
        System.out.println("Какой массив был до сортировки -> " + Arrays.toString(array));

        while (chek){
            chek = false;
            for (i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]){                    // меняем оператор сравнения на > и метод сортирует в возростающем порядке
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    chek = true;
                }
            }
        }
        System.out.println("Каким стал массив после сортировки -> " + Arrays.toString(array));
        return array;
    }

    public static int[] randomSortArray(){
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
//        Arrays.sort(array);
        return array;
    }
}

