package academy.mate.homework9;

public class Shape {
  private String name;
  private String color;
  private double perimeter;
  private double area;
  
  Shape (String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  double getPerimeter() {
    return perimeter;
  }
  
  double getArea() {
    return area;
  }
  
  String getColor() {
    return color;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getArea());
  }

}
