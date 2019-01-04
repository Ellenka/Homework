package academy.mate.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
public void searched() {
  ArrayList<String[]> db= new ArrayList<>();
  System.out.println("Enter a row");
  Scanner scan = new Scanner (System.in);
  
  while(true) {
    String reader = scan.nextLine();
    if(reader.equals("exit"))
      break;
    else {
      String[]temp =reader.split(",");
      if(temp.length!=3) {
        System.out.println("Error!");
        } else {
          db.add(temp);
          }
      }
    }
  
  String[][]dbArray = new String[db.size()][];
  for (int i = 0; i<db.size(); i++) {
    dbArray[i] = db.get(i);
    }
  for (int i = 0; i<dbArray.length; i++) {
    for (int j = 0; j<dbArray[i].length; j++) {
      System.out.print(dbArray[i][j]+" ");
      }
    System.out.println();
    }
  
  do {
    System.out.println("Please, enter a search query");
    String search = scan.nextLine();
    if(search.equals("exit")) {
      break;
      }
    for (int i = 0;i<dbArray.length;i++) {
      for (int j = 0;j<dbArray[i].length;j++) {
        if (dbArray[i][j].contains(search)) {
          System.out.println(Arrays.toString(dbArray[i]));
          break;
          }
        }
      }
    }
  while(true);
  scan.close();
  }
}
