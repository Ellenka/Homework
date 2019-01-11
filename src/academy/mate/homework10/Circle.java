package academy.mate.homework10;

public class Circle extends Shape {
  private double radius;

  Circle(String name, double radius) {
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
