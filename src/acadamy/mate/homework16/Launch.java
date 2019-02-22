package acadamy.mate.homework16;

import java.awt.EventQueue;

public class Launch {
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FirstWindow window = new FirstWindow();
          window.getFrame().setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
