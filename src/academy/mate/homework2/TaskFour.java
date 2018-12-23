package academy.mate.homework2;

import java.util.Scanner;

public class TaskFour {
  public void doubleSymbylMoved() {
    char[][] arrayDouble = {{'@', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
        {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'},
    };
    for (char arr1[] : arrayDouble) {
      for (char ca: arr1) {
        System.out.print(ca+" ");    
        }
      System.out.println();   
      }
    //System.out.println(arrayDouble[arrayDouble.length-1][arrayDouble[arrayDouble.length-1].length-1]);
    System.out.println("Please, enter a, d, w, s");
    Scanner scan = new Scanner (System.in);
    while (arrayDouble[arrayDouble.length-1][arrayDouble[arrayDouble.length-1].length-1]!='@') {
      char ch = scan.next().toLowerCase().charAt(0);
      outer:
        for (int i = 0; i<arrayDouble.length; i++) {
          for (int j = 0; j<arrayDouble[i].length; j++) {
            if (ch=='a'&&arrayDouble[i][j]=='@') {
              if(j!=0) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i][j-1];
                arrayDouble[i][j-1] = temp;
                break;
                } else {
                  continue;
                  }
              }
            if (ch=='w'&&arrayDouble[i][j]=='@') {
              if(i!=0) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i-1][j];
                arrayDouble[i-1][j] = temp;
                break;
                } else {
                  continue;
                  }   
              }
            if (ch=='d'&&arrayDouble[i][j]=='@') {
              if(j!=arrayDouble[i].length-1) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i][j+1];
                arrayDouble[i][j+1] = temp;
                break;
                } else {
                  continue;
                  }   
              }
            if (ch=='s'&&arrayDouble[i][j]=='@') {
              if(i!=arrayDouble.length-1) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i+1][j];
                arrayDouble[i+1][j] = temp;
                break outer; 
            } else {
              continue;
              }
              }
            }
          }
      for (char arr1[] : arrayDouble) {
        for (char ca: arr1) {
          System.out.print(ca+" ");    
          }
        System.out.println();
        }
      }
    System.out.println("End of program!");
    scan.close();
    }
  }
