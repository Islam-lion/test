package HomeWork.HomeWork3.mains;

import HomeWork.HomeWork3.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        calculator.memoryWrite();
        calculator.getFromMemory();
        System.out.println(calculator.getMemory());
    }
}
