package HomeWork.HomeWork3;

public class CalculatorWithCounter{
    private long countOperation = 0;
    private final CalculatorWithOperator withOperator;
    private final CalculatorWithMathCopy mathCopy;
    private final CalculatorWithMathExtends mathExtends;

    public CalculatorWithCounter(CalculatorWithOperator withOperator){
        this.withOperator = withOperator;
        this.mathCopy = null;
        this. mathExtends = null;
    }
    public CalculatorWithCounter(CalculatorWithMathCopy mathCopy){
        this.withOperator = null;
        this.mathCopy = mathCopy;
        this. mathExtends = null;
    }
    public CalculatorWithCounter(CalculatorWithMathExtends mathExtends){
        this.withOperator = null;
        this.mathCopy = null;
        this. mathExtends = mathExtends;
    }

    public double division(double a, double b){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.division(a, b);
        } else if(this.mathCopy != null){
            return mathCopy.division(a, b);
        }else{
            return this.mathExtends.division(a,b);
        }
    }
    public double multiplication(int a, int b){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.multiplication(a, b);
        } else if(this.mathCopy != null){
            return mathCopy.multiplication(a, b);
        }else{
            return this.mathExtends.multiplication(a,b);
        }
    }
    public double subtraction(double a, double b){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.subtraction(a, b);
        } else if(this.mathCopy != null){
            return mathCopy.subtraction(a, b);
        }else{
            return this.mathExtends.subtraction(a,b);
        }
    }
    public double addition(double a, double b){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.addition(a, b);
        } else if(this.mathCopy != null){
            return mathCopy.addition(a, b);
        }else{
            return this.mathExtends.addition(a,b);
        }
    }

    public double involution(double doublePositiveNumber, double degree){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.involution(doublePositiveNumber, degree);
        } else if(this.mathCopy != null){
            return mathCopy.involution(doublePositiveNumber, degree);
        }else{
            return this.mathExtends.involution(doublePositiveNumber,degree);
        }
    }

    public double absoluteValueNumber(double value){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.absoluteValueNumber(value);
        } else if(this.mathCopy != null){
            return mathCopy.absoluteValueNumber(value);
        }else{
            return this.mathExtends.absoluteValueNumber(value);
        }
    }

    public double rootNumber(double value){
        countOperation++;
        if (this.withOperator != null){
            return withOperator.rootNumber(value);
        } else if(this.mathCopy != null){
            return mathCopy.rootNumber(value);
        }else{
            return this.mathExtends.rootNumber(value);
        }
    }


    public long getCountOperation(){
        return countOperation;
    }
}
