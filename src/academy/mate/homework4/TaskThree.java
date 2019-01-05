package academy.mate.homework4;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TaskThree {
  public void timed() {
    long start = System.currentTimeMillis();//чтобы программа сама окончилась через минуту
    
    label:
    while(true) {
      Date date = new Date();
      SimpleDateFormat formatdate = new SimpleDateFormat("'Date: 'E d MMM yyyy'; Time: H:'H 'M: 'mm 'S: 'ss");
      System.out.println(formatdate.format(date));
      try {
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        long dif = end-start;
        //System.out.println(dif);
        if (dif>=60000) {
          break label;
        }
        } catch (InterruptedException e) {
          e.printStackTrace();
          }
    }
    
    
    /*for (int i = 10; i<=0; i--) {
    System.out.print("  \r"+i);
    try {
    Thread.sleep(1000);
    } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    
    }
}   */
    
    /*while(true) {
        System.out.println();
        System.out.println();
        try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
        }
    }*/
        
        
    }
}
