package academy.mate.homework3;

import java.util.Scanner;

public class WalkingDog {
  int health = 100;
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
    int randI = (int)(Math.random()*(arrayDouble.length-2)+1);// -2 - чтобы точно не выйти за пределы массива, +1 - чтобы не попасть в начальное значение собачки
    int randJ = (int)(Math.random()*10); 

    
    arrayDouble[randI][randJ] = Math.random() <0.5? 'A':'a';
    arrayDouble[randI+1][randJ] = Math.random() <0.5? 'B':'b';;
    
    
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
                checkedAdditional (arrayDouble[i][j]);
                arrayDouble[i][j-1] = temp;
                health -=5;
                break;
                } else {
                  continue;
                  }
              }
            if (ch=='w'&&arrayDouble[i][j]=='@') {
              if(i!=0) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i-1][j];
                checkedAdditional (arrayDouble[i][j]);                
                arrayDouble[i-1][j] = temp;
                health -=5;
                break;
                } else {
                  continue;
                  }   
              }
            if (ch=='d'&&arrayDouble[i][j]=='@') {
              if(j!=arrayDouble[i].length-1) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i][j+1];
                checkedAdditional (arrayDouble[i][j]);
                arrayDouble[i][j+1] = temp;
                health -=5;
                break;
                } else {
                  continue;
                  }   
              }
            if (ch=='s'&&arrayDouble[i][j]=='@') {
              if(i!=arrayDouble.length-1) {
                char temp = arrayDouble[i][j];
                arrayDouble[i][j] = arrayDouble[i+1][j];
                checkedAdditional (arrayDouble[i][j]);
                arrayDouble[i+1][j] = temp;
                health -=5;
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
      System.out.println("Health is: "+health);
      }
    System.out.println("End of program!");
    scan.close();
    }
  
  public int checkedAdditional (char c) {
    switch (c) {
    case 'A':  
      health+=40;
      break;
    case 'a':  
      health+=20;
      break;
    case 'B':  
      health-=40;
      break;
    case 'b':  
      health=-20;
      break;

    }
    return health;
  }

}
