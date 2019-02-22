package acadamy.mate.homework16;

import acadamy.mate.homework16.figures.Shape;
import acadamy.mate.homework16.figures.Utility;

public class Start {
  public static void main(String[] args) {
    User user = new User();
    Shape[] figures = new Shape[5];
    
    for (int i = 0; i<figures.length; i++) {
      
        while (figures[i]==null) {
          try {
            user.started();
            figures[i] = user.getShape();
            }
          catch (IllegalArgumentException e) {
        System.out.println("Such triangle does not exist. Please, try other sides or other figure");
        continue;
      
    }
    }
    }
      System.out.println();
    
      for (Shape f: figures) {
      f.getInfo();
      System.out.println("It's color is: "+ Utility.chooseColor());
      }
    }
}
