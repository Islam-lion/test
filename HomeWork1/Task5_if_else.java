package HomeWork.HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(Objects.equals(name,"Вася")){
            System.out.println("Привет\n" + "Я тебя так долго ждал");
        }else if(Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.println("Добрый день. А вы кто?");
        }
    }
}

class Task5_if{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(Objects.equals(name,"Вася")){
            System.out.println("Привет\n" + "Я тебя так долго ждал");
        }
        if(Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        if(!Objects.equals(name,"Вася") && !Objects.equals(name,"Анастасия")){
            System.out.println("Добрый день. А вы кто?");
        }
     }
}

class Task_switch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет\n" + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день. А вы кто?");
        }
    }
}
