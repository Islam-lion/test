package HomeWork.HomeWork3;

public class CalculatorWithMathCopy implements ICalculator{
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

}
