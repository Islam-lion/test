package HomeWork.HomeWork3.mains;

import HomeWork.HomeWork3.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        double division = calculator1.division(28, 5);
        double involution = calculator1.involution(division, 2);
        double multiplication = calculator1.multiplication(15, 7);
        double summ = calculator1.addition(4.1, (involution + multiplication));
        System.out.println(summ);
    }
}
