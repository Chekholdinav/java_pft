package sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import sandbox.task2.Point;

import static sandbox.task2.Point.distance;

public class PointTest {

  @Test
  public void distanceTest() {

    Point p1 = new Point();
    p1.x = 4;
    p1.y = 4;

    Point p2 = new Point();
    p2.y = 8;
    p2.x = 8;

    // Assert.assertEquals(distance(p1, p2), 5.65, 0.01, "message");

    Assert.assertEquals(distance(p1, p2), 5.656854249492381); //satic

    Assert.assertEquals(p1.distance(p2), 5.656854249492381); // no static
  }
}
