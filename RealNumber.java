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
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    double decimalPercent = 0.001 / 200.0;
    double high = other.getValue() * (1.0 + decimalPercent);
    double low = other.getValue() * (1.0 - decimalPercent);
    return low <= this.getValue() && this.getValue() <= high;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    double sum = this.getValue() + other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double sum = this.getValue() * other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double sum = this.getValue() / other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double sum = this.getValue() - other.getValue();
    RealNumber NewNum = new RealNumber(sum);
    return NewNum;
  }
  
}
