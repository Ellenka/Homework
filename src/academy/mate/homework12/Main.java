package academy.mate.homework12;


public class Main {
  
  public static void main (String[] args) {
    
    /*Hero one = new HeroOne("First", (int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));
    Hero two = new HeroTwo("Second",(int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));
    
    DataEngine data = new DataEngine (one, two);
    data.fight();*/
    
    Store store = new Store();
    store.insertItem(new Item("Attack", 50,0,5));
    store.insertItem(new Item("Magic", 50,50,50));
    store.insertItem(new Item("Defence", 0,50,25));
    store.insertItem(new Item("Ring", 50,0,5));
    store.insertItem(new Item("Wisdom", 0,0,100));
    store.insertItem(new Item("Kill", 75,0,15));
    
    store.printList();
    System.out.println();
    System.out.println();
    
    store.removeItem("Kill");
    store.removeItem("Magic");
    
    store.printList();
  }

}
