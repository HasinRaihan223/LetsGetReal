public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  // public boolean equals(RealNumber other){
  //   double decimalPercent = 0.001 / 200.0;
  //   double high = other.getValue() * (1.0 + decimalPercent);
  //   double low = other.getValue() * (1.0 - decimalPercent);
  //   return low <= this.getValue() && this.getValue() <= high;
  // }

  public RealNumber add(RealNumber other){
    double sum = this.getValue() + other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  public RealNumber multiply(RealNumber other){
    double sum = this.getValue() * other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  public RealNumber divide(RealNumber other){
    double sum = this.getValue() / other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  public RealNumber subtract(RealNumber other){
    double sum = this.getValue() - other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  /*

  //Small Tester

  public static void main(String[] args){

    //Checks getValue and toString
    RealNumber t1 = new RealNumber(0.25);
    System.out.println(t1.getValue());

    RealNumber t2 = new RealNumber(0.25000000000001);
    System.out.println(t1.equals(t2));

    //Operations
    RealNumber t3 = new RealNumber(0.05);
    System.out.println(t1.multiply(t3));
    System.out.println(t1.divide(t3));
    System.out.println(t1.add(t3));
    System.out.println(t1.subtract(t3));
  }

  */

}
