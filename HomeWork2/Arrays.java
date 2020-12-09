package HomeWork.HomeWork2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        outputInReverseOrder();
    }
    public static int[] arrayFromConsole(){                     //task 2.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите размер массива: ");
        int size = scanner.nextInt();
        int[] container = new int[size];
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i<size; i++){
            container[i] = scanner.nextInt();
        }
        return container;
    }

    public static int[] outputOfAllElements(){                      //task 2.2.1
        int i = 0;
        int[] arr = arrayFromConsole();
        do {
            System.out.print(arr[i] + " ");
            i++;
        }while (i < arr.length);
        return arr;
    }

    public static int[] outputEverySecondElements(){                    //task 2.2.2
        int[] arr = arrayFromConsole();
        int i = 1;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i+=2;
        }
        return arr;
    }

    public static int[] outputInReverseOrder(){                         //task 2.2.3
        int[] arr = arrayFromConsole();
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}


