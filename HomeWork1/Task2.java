package HomeWork.HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int two = 2;
        int eight = 8;
         int a = 5 + 2 / 8;             //сперва разделяем потом прибавляем.   Результат 5.25
         int b = (5 + 2) / 8;           //сперва решаем то что в скобке после разделяем.   Результат 0
         int c = (5 + two++) / 8;       //переменная two сперва используется, только потом инкриментируется и из за
                                                                            //этого сперва 5+2 после деление на 8;   Результат 0

         int d = (5 + two++) / --eight;     //сперва 5+3 после деление на 7, так как сперва дикриментируем после исп. Результат 1
        int e = (5 * 2 >> two++) / --eight;  //умножаем, после берем число 10 и в двоичном коде двигаем биты в право на 4,
                                                                            // и делим на 6. Результат 0

         int g =(5 + 7 > 20 ? 68 : 22 * 2 >> two++) / --eight;   // в тернарном выражении дает false и работаем со второй операндой,
                                                                    //44 в двоичном коде двигаем на 5 и делим на 5. Результат 0;

   //     int f = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> two++) / --eight; // в тернарном выражении первая операнда
                                                                            // это логическое выражение  а вторая операнда
                                                                                 // целочисленное выражение из за этого и ошибка
         boolean h = 6 - 2 > 3 && 12 * 12 <= 119;       //выражение слева дает true, выражение с права дает false. Результат false.
         boolean i = true && false;                     // логический оператор && выдает на выходе тру если все операнды тру

    }
}
