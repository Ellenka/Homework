package academy.mate.homework6.figures;

public class Circle {
  private String name;
  private String color;
  private double perimeter;
  private double area;
  
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
  
  double getArea () {
    area = Math.PI*Math.pow(radius, 2);
    return area;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getArea());
  }
  

}
