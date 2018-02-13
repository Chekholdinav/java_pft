package sandbox.task2;

public class Task2 {

  public static void main(String[] args) {

    Point p1 = new Point(6, 9);
    Point p2 = new Point(3, 7);

    System.out.println("√(" + p2.x + "-" + p1.x + ")^2" + "+" + "√(" + p2.y + "-" + p1.y + ")^2" + " = " + "√(" + (p2.x - p1.x) + ")^2" + " + " + "√(" + (p2.y - p1.y) + ")^2" + " = " + "√" +
            (((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y))) + " = " + p1.distance(p2));

  }
}
