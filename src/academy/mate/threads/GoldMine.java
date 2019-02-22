package academy.mate.threads;

public class GoldMine {
  
  volatile private int coins = 1000;

  public int getCoins() {
    return coins;
  }

  public void setCoins(int coins) {
    this.coins = coins;
  }
  
  
}
