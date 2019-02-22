package acadamy.mate.homework16.figures;

public class Utility {
  static String chooseColor () {
    String[] colors = {"Yellow", "Orange", "Pink", "Red", "Blue", 
        "Green", "Violet", "Grey", "White", "Black"};
    int i;
    i = (int)(Math.random()*colors.length);
    return colors[i];
  }

}
