package ru.ntk.ptf.sandbox;

        import org.testng.Assert;
        import org.testng.annotations.Test;
        import ru.ntk.pft.sandbox.Square;

public class SquareTest {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
