package academy.mate.homework7;

public class Shape {
  private String name;
  private String color;
  private double perimeter;
  private double square;
  
  Shape(String name) {
    this.name = name;
    
  }
  public String getName() {
    return name;
  }
  
  double getPerimeter() {
    return perimeter;
  }
  double getSquare() {
    return square;
  }
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getSquare());
  }

}
