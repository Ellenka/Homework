package academy.mate.homework12;

import java.util.Iterator;
import java.util.LinkedList;

public class Store {
  
  LinkedList<Item> itemsList = new LinkedList<>();
 
  public void insertItem(Item item) {
    itemsList.add(item);
    for (int i = 0; i<itemsList.size()-1; i++) {
      for (int j = 0;j<itemsList.size()-1-i;j++) {
        if(itemsList.get(j).getIntel()>itemsList.get(j+1).getIntel()) {
          Item temp = itemsList.get(j);
          itemsList.set (j,itemsList.get(j+1));
          itemsList.set(j+1,temp);
        }    
      }
    }   
  }
  public void printList() {
    Iterator <Item> itItems = itemsList.iterator();
    while(itItems.hasNext()) {
      System.out.println(itItems.next().toString());
    }
  }
  public void removeItem(String name) {
    Iterator<Item> itItems = itemsList.iterator();
    while(itItems.hasNext()) {
      if (itItems.next().getName().equals(name)) {
        itItems.remove();
      }
    }
    
  }
  }
