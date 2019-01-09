package academy.mate.homework9;

public class Square extends Shape {
  private double side;

  Square(String name, double side) {
    super(name);
    this.side = side;
  }
  
  @Override
  double getPerimeter() {
    return 4*side;
  }
  
  double getArea() {
    return Math.pow(side, 2);
  }

}
