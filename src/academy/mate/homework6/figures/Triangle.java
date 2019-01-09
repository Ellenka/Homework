package academy.mate.homework6.figures;

public class Triangle {
  private String name;
  private String color;
  private double perimeter;
  private double area;
  
  private double a;
  private double b;
  private double c;
  
  Triangle (String name, double a, double b, double c) {
    this.name = name;
    this.a = a;
    this.b = b;
    this.c = c;
    
  }
  
  public String getName() {
    return name;
  }
  
  double getPerimeter () {
    perimeter = a+b+c;
    return perimeter;
  }
  
  double getArea () {
    area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    return area;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getArea());
  }

}
