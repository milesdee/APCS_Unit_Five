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
        return(getNumerator()+ "/" +getDenominator());
    }

//    public static void main(String[] args) {
//        Fraction f = new Fraction(423987,-847974);
//
//        System.out.println(f.toString());
//    }
}