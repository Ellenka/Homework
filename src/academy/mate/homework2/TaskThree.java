package academy.mate.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
  public void symbolMoved() {
    char[] array = {'@', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
    System.out.println(Arrays.toString(array));
    System.out.println("Plese, a or d");
    Scanner scan = new Scanner (System.in);
    while (array[array.length-1]!='@') {    
       char ch = scan.next().toLowerCase().charAt(0);
       for (int i = 0; i<array.length; i++) {
         if (ch=='a'&&array[i]=='@') {
           if (i!=0) {
             char temp = array[i];
             array[i] = array[i-1];
             array[i-1] = temp;
             break;
             } else {
               continue;
               }
           }
         if (ch=='d'&&array[i]=='@') {
           char temp = array[i];
           array[i] = array[i+1];
           array[i+1] = temp;
           break;
           } 
         }
       System.out.println(Arrays.toString(array));
   }
    System.out.println("End of program!");
    scan.close();
   //System.out.println(ch);
    }
  }
