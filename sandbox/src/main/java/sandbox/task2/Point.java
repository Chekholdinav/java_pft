package sandbox.task2;

public class Point {

  public static void main(String[] args){

    double p1 = 2 ;

    double x1 = 8.0;
    double x2 = 4.0;
    double y1 = 6.0;
    double y2 = 3.0;
    double A = distance(x1,x2);
    double B = distance(y1,y2);

    System.out.println(" _________    __________     __________    _____");
    System.out.println("√("+ x2 + "-" + x1 +")^2" + "+" + "√("+ y2 + "-" + y1 +")^2" + " + " + "√" +  A + " + " + B + " + " + "√"+ (A + B) + " = " + Math.sqrt(A+B));
  }

  public static double distance(double p1, double p2){

    return (p2 - p1) * (p2 - p1);

  }

}
