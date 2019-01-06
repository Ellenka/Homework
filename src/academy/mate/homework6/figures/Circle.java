package academy.mate.homework6.figures;

public class Circle {
  private String name;
  private String color;
  private double perimeter;
  private double square;
  
  private double radius;

  Circle(String name, double radius) {
    this.name = name;
    this.radius = radius;
    
  }
  
  
  public String getName() {
    return name;
  }


  
  double getPerimeter () {
    perimeter = 2*Math.PI*radius;
    return perimeter;
  }
  
  double getSquare () {
    square = Math.PI*Math.pow(radius, 2);
    return square;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getSquare());
  }
  

}
