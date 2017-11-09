public class Hyperbolic {

    public static double sinhx(double x){
        return (Math.exp(x)-Math.exp(-x))/2;
    }

    public static double coshx(double x){
        return (Math.exp(x)+Math.exp(-x))/2;
    }

    public static double tanhx(double x){
        return (Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x));
    }

    public static double cothx(double x){
        return (Math.exp(x)+Math.exp(-x))/(Math.exp(x)-Math.exp(-x));
    }

    public static double sechx (double x){
        return (2/(Math.exp(x)+Math.exp(-x)));
    }

    public static double cosechx(double x){
        return (2/ (Math.exp(x)-Math.exp(-x)));
    }

    public static void main(String[] args) {
        StdOut.println("Enter the value of x");
        double x=StdIn.readDouble();


        StdOut.println("The values for hyperbolic functions are:");
        StdOut.println("Sin: "+ sinhx(x));
        StdOut.println("Cos: "+ coshx(x));
        StdOut.println("Tan: "+tanhx(x));
        StdOut.println("Cot: "+ cothx(x));
        StdOut.println("Sec: "+ sechx(x));
        StdOut.println("Cosec: "+ cosechx(x));
    }
}
