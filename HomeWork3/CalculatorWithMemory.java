package HomeWork.HomeWork3;

public class CalculatorWithMemory {

    private double memory;

    public double division(double a, double b){
        return a/b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double addition(double a, double b){
        return a+b;
    }

    public double involution(double doublePositiveNumber, double degree){
        return Math.pow(doublePositiveNumber, degree);
    }

    public double absoluteValueNumber(double value){
        return Math.abs(value);
    }

    public double rootNumber(double value){
        return Math.sqrt(value);
    }

    public double memoryWrite(){
        double division = division(28, 5);
        double involution = involution(division, 2);
        double multiplication = multiplication(15, 7);
        double memory = addition(4.1, (involution + multiplication));
        return memory;
    }

    public double getFromMemory(){
        memoryWrite();
        memory = 0;
        memory = memoryWrite();
        return memory;
    }

    public double getMemory() {
        return memory;
    }
}
