package ru.stqa.pft.samdbox;

public class PointTest {
  public static void main(String[] args) {
    double x1 = 5;
    double y1 = 4;
    double x2 = 4;
    double y2 = 2;

    System.out.println("Проверка расстояния между точками: p1 (" + x1 + ", " + y1 + ") и p2 (" + x2 + ", " + y2 + ") равно " + distances(x1, y1, x2, y2));


    Point p = new Point(2, 3, 4, 8);
    System.out.println("Расстояние между точками: p1 (" + p.x1 + ", " + p.y1 + ") и p2 (" + p.x2 + ", " + p.y2 + ") равно " + p.distance());

  }

  public static double distances(double x1, double y1, double x2, double y2) {
    return  Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
  }
}
