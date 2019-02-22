package academy.mate.threads;

public class GMMain {

  public static void main(String[] args) {
    GoldMine mine = new GoldMine();
    
    WorkerA wa = new WorkerA("Worker A", mine);
    WorkerB wb = new WorkerB("Worker B", mine);
    WorkerC wc = new WorkerC("Worker C", mine);
    
    Barrack barrack = new Barrack(mine);

    //System.out.println(Thread.getAllStackTraces().keySet().size());
  }

}
