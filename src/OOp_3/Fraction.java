package OOp_3;
public class Fraction {

    private int numerator, denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }

    public Fraction reduce() {
        int UCLN = gcd(this.numerator, this.denominator);
        this.denominator = this.denominator / UCLN;
        this.numerator = this.numerator / UCLN;
        return this;
    }

    public Fraction add(Fraction fractionTwo) {
        //this.numerator: fraction 1
        //fractionTwo.numerator: fraction 2
        this.numerator = (this.numerator * fractionTwo.denominator) +
                (this.denominator * fractionTwo.numerator);
        this.denominator = this.denominator * fractionTwo.denominator;
        return this;
    }

    public Fraction subtract(Fraction fractionTwo) {
        this.numerator = (this.numerator * fractionTwo.denominator) -
                (this.denominator * fractionTwo.numerator);
        this.denominator = this.denominator * fractionTwo.denominator;
        return this;
    }

    public Fraction multiply(Fraction fractionTwo) {
        this.numerator = this.numerator * fractionTwo.numerator;
        this.denominator = this.denominator * fractionTwo.denominator;
        return this;
    }

    public Fraction divide(Fraction fractionTwo) {
        if (fractionTwo.numerator != 0) {
            this.numerator = this.numerator * fractionTwo.denominator;
            this.denominator = this.denominator * fractionTwo.numerator;
        }
        return this;
    }


    public boolean equals(Object obj) {
        if ((obj instanceof Fraction)) {
            Fraction other = ((Fraction) obj);
            return (this.numerator / (double) this.denominator) == (other.numerator / (double) other.denominator);
        }
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
