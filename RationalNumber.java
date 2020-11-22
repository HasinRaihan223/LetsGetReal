public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    if (deno < 0) {
      numerator = -1*numerator;
      denominator = -1*denominator;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / (double) denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }

  public boolean equals(RationalNumber other){
    if (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator()){
      return true;
    }
    else return false;
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    while (a != b){
      if (a > b)
        a -= b;
      else
        b -= a;
    }
    return a;
  }

  private void reduce(){
    if (numerator != 0){
      int common = gcd(Math.abs(numerator), denominator);
      numerator = numerator / common;
      denominator = denominator / common;
    }
  }

//-------------------------Operations---------------------------//

  public RationalNumber multiply(RationalNumber other){
    int numer = this.getNumerator() * other.getNumerator();
    int denom = this.getDenominator() * other.getDenominator();
    return new RationalNumber(numer, denom);
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int commonDenominator = this.getDenominator() * other.getDenominator();
    int numer1 = this.getNumerator() * other.getDenominator();
    int numer2 = other.getNumerator() * this.getDenominator();
    int NumerSum = numer1 + numer2;
    return new RationalNumber(NumerSum, commonDenominator);
  }

  public RationalNumber subtract(RationalNumber other){
    int commonDenominator = this.getDenominator() * other.getDenominator();
    int numer1 = this.getNumerator() * other.getDenominator();
    int numer2 = other.getNumerator() * this.getDenominator();
    int NumerDiff = numer1 - numer2;
    return new RationalNumber(NumerDiff, commonDenominator);
  }

  /*

  //Small Tester
  public static void main(String[] args){

    //Checks reduce
    RationalNumber t1 = new RationalNumber(25,5);
    System.out.println(t1.toString());

    //Checks equals
    RationalNumber t2 = new RationalNumber(5,1);
    System.out.println(t1.equals(t2));

    //Checks reciprocal
    System.out.println(t1.reciprocal());

    //Checks GCD
    System.out.println(gcd(25,5));

    //getValue
    System.out.println(t1.getValue());

    //Operators
    RationalNumber t3 = new RationalNumber(12,3);
    System.out.println(t3.toString());
    System.out.println("Operations");
    System.out.println(t1.multiply(t3).toString());
    System.out.println(t1.add(t3).toString());
    System.out.println(t1.subtract(t3).toString());
    System.out.println(t1.divide(t3).toString());
  }

  */

}
