package academy.mate.homework10;

import java.util.Scanner;

public class User {
  
  private Shape shape;
  
  public Shape getShape() {
    return shape;
  }
  
  Scanner scan = new Scanner(System.in);
  
  public void started () throws IllegalArgumentException {
    
    
    System.out.println("Please, enter 1 for circle, 2 for square, 3 for triangle, 0 for exit");
        int n = scan.nextInt();
        switch(n) {
        case 1: 
          System.out.println("Please, enter the radius:");
          double rad = scan.nextDouble();
          shape = new Circle("Circle", rad);
          shape.getInfo();
          break;
        case 2:
          System.out.println("Please, enter the side:");
          double s = scan.nextDouble();
          shape = new Square("Square", s);
          shape.getInfo();
          break;
        case 3: 
          System.out.println("Please, enter three sides:");
          double a1 = scan.nextDouble();
          double b1 = scan.nextDouble();
          double c1 = scan.nextDouble();
          if (a1+b1 > c1 && a1+c1 > b1 && b1+c1 > a1) { 
            shape = new Triangle("Triangle", a1, b1,c1);
            shape.getInfo();
            break;
            } else {
              throw new IllegalArgumentException();
              }
        case 0:
          System.exit(0);
          break;
        default:
          System.out.println("Wrong choice. Please, enter a correct value");
        }
        
      }

  }
 
