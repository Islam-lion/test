package HomeWork.HomeWork3.mains;

import HomeWork.HomeWork3.CalculatorWithCounter;
import HomeWork.HomeWork3.CalculatorWithOperator;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter withCounter1 = new CalculatorWithCounter(new CalculatorWithOperator());

        double division = withCounter1.division(28, 5);
        double involution = withCounter1.involution(division, 2);
        double multiplication = withCounter1.multiplication(15, 7);
        double summ = withCounter1.addition(4.1, (involution + multiplication));
        System.out.println(summ);
        System.out.println(withCounter1.getCountOperation());

    }
}
