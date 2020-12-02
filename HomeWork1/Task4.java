package HomeWork.HomeWork1;

public class Task4 {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(vacation || !weekday){
            System.out.println("Можем спать дальше");
            return true;
        }else {
            System.out.println("Пора идти на работу");
            return false;
        }
    }

    public static void main(String[] args) {
        sleepIn(false,true);
    }
}
