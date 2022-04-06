package Data;

public class Operations {
    private double a,b;

    public static double addition(double a, double b){
        return a+b;
    }

    public static double subtract (double a, double b){
        return a-b;
    }

    public static double multiplication (double a, double b){
        return a*b;
    }

    public static double divide (double a, double b) {
        if (b != 0)
            return a / b;
        else
            throw new ArithmeticException("Nie dzielimy przez zero!");
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
