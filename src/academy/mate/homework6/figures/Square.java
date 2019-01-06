package academy.mate.homework6.figures;

public class Square {
  private String name;
  private String color;
  private double perimeter;
  private double square;
  
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
  
  double getSquare () {
    square = Math.pow(side, 2);
    return square;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getSquare());
  }

  
}
