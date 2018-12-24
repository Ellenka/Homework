package academy.mate.homework3;

import java.util.Scanner;

public class LessonThreeHomework {
  public void first() {
    Scanner scan = new Scanner(System.in);
    String full = scan.nextLine();
    String last = full.substring(0, full.indexOf(' '));
    String left = full.substring(full.indexOf(' ')+1);
    String patronymic = left.substring(left.indexOf(' ')+1);
    
    //String fullone = full.trim();
    System.out.println(last.substring(0,1).toUpperCase() + last.substring(1) + " "+left.substring(0,1).toUpperCase()+". "+patronymic.substring(0,1).toUpperCase()+".");
    scan.close();
  }
//////////////////////////////////////////////////////////////////////////
public void cased() {
double value = 343;
int discount;
switch((int)(value/100)) {
case 0: case 1: case 2:
  discount = 0;
  break;
  
case 3:
  discount = 3;
  break;
  
default: 
  discount = 5;
  System.out.println("Your disctount is "+discount+"%, total to pay: " + (value-value/100*discount));

}
}

}
