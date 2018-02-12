package sandbox.task2;

public class Point {
  public double x;
  public double y;

  public static void main(String[] args) {

    Point p1 = new Point();
    p1.x = 4;
    p1.y = 4;

    Point p2 = new Point();
    p2.y = 8;
    p2.x = 8;

    double x1 = 8.0;
    double x2 = 4.0;
    double y1 = 6.0;
    double y2 = 3.0;

    System.out.println("√(" + p2.x + "-" + p1.x + ")^2" + "+" + "√(" + p2.y + "-" + p1.y + ")^2" + " = " + "√(" + (p2.x - p1.x) + ")^2" + " + " + "√(" + (p2.y - p1.y) + ")^2" + " = " + "√" + (((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y))) + " = " + distance(p1, p2));
    System.out.println("Ответ: " + p1.distance(p2));

  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));

  }

  public double distance(Point p2) {
    return Math.sqrt(((p2.x - x) * (p2.x - x)) + ((p2.y - y) * (p2.y - y)));
  }

}