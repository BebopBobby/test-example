public class Calculator {

    public Calculator() {
    }

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
        //return 0;
    }

    public double square(double x){
        return x * x;
        //return 0;
    }

    public double squareRoot(double x){
        //return 0;
        return Math.sqrt(x);
    }

    public double exponent(double x, double y){
        //return 0;
        return Math.pow(x, y);
    }

    public double sin(double x){
        //return 0;
        return Math.sin(x);
    }
}
