package ru.stqa.pft.samdbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PoitTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(5, 4, 4, 2);
    Assert.assertEquals(p1.distance(),2.23606797749979);

    Point p = new Point(2, 3, 4, 8);
    Assert.assertEquals(p.distance(),5.385);


  }

}
