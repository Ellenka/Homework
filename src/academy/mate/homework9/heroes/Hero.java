package academy.mate.homework9.heroes;

public class Hero {
private String name;
  
  private int health = 100;
  private int intelligence;
  private int agility;
  private int strength;
  private int strike;
  
  private Item[] items = new Item[3];
  
  public Hero(String name, int intelligence, int agility, int strength) {
    
    this.name = name;
    this.intelligence = intelligence;
    this.agility = agility;
    this.strength = strength;
    strike = intelligence/3+agility/2+strength;
    
    items[0] = new Item("Attack",(int)(Math.random()*10+2),0);
    items[1] = new Item("Protect", 0, (int)(Math.random()*10+2));
    items[2] = new Item ("Additional", (int)(Math.random()*20),(int)(Math.random()*20));
  
  }
  public void setHealth(int health) {
    this.health = health;
 
  }
  
  public int getHealth() {
    return health;
  }
  public String getName() {
    return name;
  }
  public int getStrike() {
    return strike;
  }
  public Item[] getItems() {
    return items;
  }

  @Override
  public String toString() {
    return name+": intelligence is "+intelligence +", agility is " +agility + ". strength is " + strength+
        ", strike is " + strike + "\nitems are: "+items[0].toString()+", " + items[1].toString()+", "+items[2].toString();
  }
  


}
