package acadamy.mate.homework16.figures;

public class Circle  extends Shape {
  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }
  
  @Override
  double getPerimeter() {
    return 2*Math.PI*radius;
  }
  
  double getArea() {
    return Math.PI*Math.pow(radius, 2);
  }

}
