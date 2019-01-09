package academy.mate.homework6.figures;

public class Square {
  private String name;
  private String color;
  private double perimeter;
  private double area;
  
  private double side;
  
  Square(String name, double side) {
    this.name = name;
    this.side = side;
    
  }
  public String getName() {
    return name;
  }
  
  double getPerimeter () {
    perimeter = 4*side;
    return perimeter;
  }
  
  double getArea () {
    area = Math.pow(side, 2);
    return area;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getArea());
  }

  
}
