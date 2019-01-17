package academy.mate.homework13;


import java.util.Iterator;

public class Start {
  
  public static void main (String [] args) {
    
    MyArrayList softs = new MyArrayList();
    softs.add(new SoftDrink("Fanta", "Orange"));
    softs.add(new SoftDrink("Cola", "Brown"));
    softs.add(new SoftDrink("Sprite", "Green"));
    softs.add(new SoftDrink("Tea", "Amber"));
    softs.add(new SoftDrink("Kompot", "Red"));
    
    softs.add(5, new SoftDrink("Coffee", "Morning"));
    System.out.println(softs.size());
   
   
    
   Iterator <SoftDrink> it = softs.iterator();
   while(it.hasNext()) {
     System.out.println(it.next());
   }// не выводит, если элемент вставлен за заполненным массивом (например, в массиве 5 элементов, а это вставлен на 7-ю позицию)
   
   softs.sort();
   while(it.hasNext()) {
     System.out.println(it.next());
    }
    
  }
  } 

