package acadamy.mate.homework16.figures;

public class Triangle extends Shape {
  private double a;
  private double b;
  private double c;

  Triangle(String name, double a, double b, double c) {
    super(name);
    this.a = a;
    this.b = b;
    this.c = c;
    
  }
  
  @Override
  double getPerimeter() {
    return a+b+c;
  }
  
  double getArea () {
    return Math.sqrt(getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c));
    }

}
