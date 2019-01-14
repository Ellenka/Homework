package academy.mate.homework10.heroes;

public class Item {
  private String name;
  private int attack;
  private int defence;
  
  public Item() {
    
  }
  
  public Item(String name, int attack, int defence) {
    
    this.name = name;
    this.attack = attack;
    this.defence = defence;
  }
  


  public String getName() {
    return name;
  }


  public int getAttack() {
    return attack;
  }


  public int getDefence() {
    return defence;
  }

  @Override
  public String toString() {
    return name + " - attack: " + attack + ", defence: " + defence;
  }

}
