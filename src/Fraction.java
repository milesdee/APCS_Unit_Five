public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int den) {
        //numerator negative
        if ((num < 0 && den > 0)) {
            this.numerator = num;
            this.denominator = den;
        }
        //denominator negative
        else if ((num > 0 && den < 0)) {
            this.numerator = -num;
            this.denominator = Math.abs(den);
        }
        //both negative or neither positive
        else {
            this.numerator = Math.abs(num);
            this.denominator = Math.abs(den);
        }
        reduce(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int getLCD(int x, int y){
        while(x % y != 0){
            int a = x;
            int b = y;
            x = b;
            y = a % b;
        }
        return Math.abs(y);
    }

    private void reduce(int n , int d){
        int LCD = getLCD(n, d);
        numerator = n / LCD;
        denominator = d / LCD;
    }

    public String toString(){
        if(numerator > denominator){
            int x = (numerator/denominator);
            numerator %= denominator;
            return( x + " " + numerator + "/" + denominator);
        }
        else return(numerator + "/" + denominator);
    }

    public static String add(String f1, String f2) {
        int a = Integer.parseInt(f1.substring(0, f1.indexOf("/")));
        int b = Integer.parseInt(f1.substring(f1.indexOf("/") + 1));
        int c = Integer.parseInt(f2.substring(0, f2.indexOf("/")));
        int d = Integer.parseInt(f2.substring(f2.indexOf("/") + 1));
        int newnum = (a * d) + (c * b);
        int newden = b * d;
        Fraction newFrac = new Fraction(newnum, newden);
        return newFrac.toString();
    }

    public static String subtract(String f1, String f2) {
        int a = Integer.parseInt(f1.substring(0, f1.indexOf("/")));
        int b = Integer.parseInt(f1.substring(f1.indexOf("/") + 1));
        int c = Integer.parseInt(f2.substring(0, f2.indexOf("/")));
        int d = Integer.parseInt(f2.substring(f2.indexOf("/") + 1));
        int newnum = (a * d) - (c * b);
        int newden = b * d;
        Fraction newFrac = new Fraction(newnum, newden);
        return newFrac.toString();
    }

    public static String multiply(String f1, String f2) {
        int a = Integer.parseInt(f1.substring(0, f1.indexOf("/")));
        int b = Integer.parseInt(f1.substring(f1.indexOf("/") + 1));
        int c = Integer.parseInt(f2.substring(0, f2.indexOf("/")));
        int d = Integer.parseInt(f2.substring(f2.indexOf("/") + 1));
        int newnum = a * c;
        int newden = b * d;
        Fraction newFrac = new Fraction(newnum, newden);
        return newFrac.toString();
    }

    public static String divide(String f1, String f2) {
        int a = Integer.parseInt(f1.substring(0, f1.indexOf("/")));
        int b = Integer.parseInt(f1.substring(f1.indexOf("/") + 1));
        int c = Integer.parseInt(f2.substring(0, f2.indexOf("/")));
        int d = Integer.parseInt(f2.substring(f2.indexOf("/") + 1));
        int newnum = a * d;
        int newden = b * c;
        Fraction newFrac = new Fraction(newnum, newden);
        return newFrac.toString();
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(2, 3);
        System.out.println(add(f1.toString(), f2.toString()));
    }
}



