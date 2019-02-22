package acadamy.mate.homework16.figures;

public abstract class Shape {
  private String name;
  private String color;

  
  Shape (String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  abstract double getPerimeter();
  
  abstract double getArea();
  
  String getColor() {
    return color;
  }
  
  void getInfo() {
    System.out.println("The figure is: "+ getName()+", its perimeter is: "+getPerimeter()+
        ", its square is: "+getArea());
  }
  

}
