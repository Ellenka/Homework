package academy.mate.homework6.figures;

import java.util.Scanner;

public class User {

  Scanner scan = new Scanner(System.in);
  public void started () {
    while(true) {
    System.out.println("Please, enter 1 for circle, 2 for square, 3 for triangle, 0 for exit");
    int n = scan.nextInt();
    switch(n) {
    case 1: 
      System.out.println("Please, enter the radius:");
      double rad = scan.nextDouble();
      Circle circle = new Circle("Circle", rad);
      circle.getInfo();
      break;
    case 2:
      System.out.println("Please, enter the side:");
      double s = scan.nextDouble();
      Square sqr = new Square("Square", s);
      sqr.getInfo();
      break;
    case 3: 
      System.out.println("Please, enter three sides:");
      double a1 = scan.nextDouble();
      double b1 = scan.nextDouble();
      double c1 = scan.nextDouble();
      if (a1+b1 > c1 && a1+c1 > b1 && b1+c1 > a1) { 
        Triangle triangle = new Triangle("Triangle", a1, b1,c1);
        triangle.getInfo();
        break;
      } else {
        System.out.println("Such triangle does not exist. Please, try other sides");  
        break;
      }
    case 0:
          System.exit(0);
          break;
    default:
      System.out.println("Wrong choice. Please, enter a correct value");
      }
    
    }
    
  }

}


