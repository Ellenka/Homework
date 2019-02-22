package academy.mate.threads;

public class Barrack implements Runnable {
  
  int number = 0;
  volatile GoldMine mine;

  public Barrack(GoldMine mine) {
    
   this.mine = mine;
    
    new Thread(this).start();

  }

  @Override
  public void run() {
    
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }
    
    synchronized(this) {
    while (mine.getCoins()>0) {
      number ++;
      new Worker("Worker"+number, mine);
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    
  }
    }
    }
  }

}
