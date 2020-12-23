package HomeWork.HomeWork3;

public class CalculatorWithCounterInterface {

    private long countOperation = 0;

    private final ICalculator calc1;

    CalculatorWithCounterInterface(ICalculator calc1){
        this.calc1 = calc1;
    }

    public double division(double a, double b){
        countOperation++;
        return division(a, b);
    }
    public double multiplication(int a, int b){
        countOperation++;
        return multiplication(a, b);
    }
    public double subtraction(double a, double b){
        countOperation++;
        return subtraction(a, b);
    }
    public double addition(double a, double b){
        countOperation++;
        return addition(a, b);
    }

    public double involution(double doublePositiveNumber, double degree){
        countOperation++;
        return involution(doublePositiveNumber, degree);
    }

    public double absoluteValueNumber(double value){
        countOperation++;
        return absoluteValueNumber(value);
    }

    public double rootNumber(double value){
        countOperation++;
        return rootNumber(value);
    }


    public long getCountOperation(){
        return countOperation;
    }
}
