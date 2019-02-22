package academy.mate.threads;

public class Worker implements Runnable {
  
  String name;
  
  volatile GoldMine mine;
  int collected = 0;
  
 public Worker(String name, GoldMine mine) {
    
    this.name = name;
    this.mine = mine;
    new Thread(this, name).start();
  }

@Override
public void run() {
  
 synchronized (this) {
  
 int left;
  
  while (mine.getCoins() >=0) {
    
     if (mine.getCoins()<3) {
       collected +=mine.getCoins();
     } else {
       collected +=3;
     }
    System.out.println(name +" collected: "+collected +" coins");
    
    left = mine.getCoins()-3;
    
    mine.setCoins(left);
   
      
      
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
    
  }
  }
}



