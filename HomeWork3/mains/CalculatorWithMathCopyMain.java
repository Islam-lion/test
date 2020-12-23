package HomeWork.HomeWork3.mains;

import HomeWork.HomeWork3.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double division = calculator.division(28, 5);
        double involution = calculator.involution(division, 2);
        double multiplication = calculator.multiplication(15, 7);
        double summ = calculator.addition(4.1, (involution + multiplication));
        System.out.println(summ);
    }
}
