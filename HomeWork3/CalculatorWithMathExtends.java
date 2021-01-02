package HomeWork.HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator{
    @Override
    public double involution(double doublePositiveNumber,double degree){
        return Math.pow(doublePositiveNumber, degree);
    }

    @Override
    public double absoluteValueNumber(double value){
        return Math.abs(value);
    }

    @Override
    public double rootNumber(double root){
        return Math.sqrt(root);
    }


}
