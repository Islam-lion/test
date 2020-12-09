package HomeWork.HomeWork2;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

    }

    public static int multiplier(int a){            //task 1.1
       int answer = 1;
       if(a > 10 || a < 1){
           System.out.print("Вы ввели не правильное значение!!!\n" + "Введите число (1-10)");
           return 0;
       }
       for(int i = 1; i <= a; i++){
           answer *= i;
           if(i == (a)){
               System.out.print(i+" = ");
               break;
           }
           System.out.print(i+" * ");
       }
       System.out.println(answer);
       return answer;
   }

   public static int production(int l){                 //task 1.2
       String str = String.valueOf(l);
       int counter = 1;
       int answer = 1;
       for(int i = 0; i < str.length(); i++){
           counter = Integer.parseInt(String.valueOf(str.charAt(i)));
           answer *= counter;
           if(i == str.length()-1){
               System.out.print(counter + " = ");
               break;
           }
           System.out.print(counter + " * ");
       }
       System.out.println(answer);

       return answer;
   }

   public static int exponentiation(){                              //task 1.3
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите число которое будем возводить: ");
       double num1 = Double.parseDouble(scanner.next());  //вот тут у меня вопрос: я использовал метод nextDouble, но
                                                            //но у меня выбрасывает InputMismatchException.
                                                                //попробовал next получается. Не понял в чем ошибка
       System.out.println("Введите степень: ");
       int num2 = scanner.nextInt();
       scanner.close();
       int prod = 1;
       if(num2 > 0){
           for(int i = 0; i < num2; i++){
               prod *= num1;
           }
       }
       System.out.println(prod);
       return prod;
   }

//   public static long overflowLong(){                 //task 1.4
//        long a = 1;
//        while (a <=  9_223_372_036_854_775_806l || a <=  -9_223_372_036_854_775_806l){
//            Random random = new Random();
//            a *= random.nextLong();
//        }
//       System.out.println("До переполнения a = 1+\n" + "После переполнения a = "+a);
//            return a;
//   }


   public static void multiplicationTable(){                //task 1.5
        for(int i = 1; i<10; i++){
            for(int j = 2; j<10; j++){
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
   }
}
