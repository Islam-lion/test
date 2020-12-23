package HomeWork.HomeWork3;

public class CalculatorWithOperator implements ICalculator{

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
        double summ = 1;
        for (int i = 0; i < degree; i++) {
            summ *= doublePositiveNumber;
        }

        return summ;
    }

    public double absoluteValueNumber(double value){
        return (value <= 0d) ? 0d - value : value;
    }

    public double rootNumber(double root){
       return Math.sqrt(root);
    }

}
