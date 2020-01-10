package math_operation;

public class MathOperation {
    public MathOperation() {
    }

    public double add(double a, double b){
        return a+b;
    }
    public double add(double a,double b,double c){

        return add(a,b) +c;
    }
    public double add(double a,double b,double c,double d){

        return add(a,b,c) +d;
    }

}
