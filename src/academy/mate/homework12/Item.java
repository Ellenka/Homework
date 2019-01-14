package academy.mate.homework12;

public class Item {
  private String name;
  private int attack;
  private int defence;
  private int intel;
  
  public Item() {
    
  }
  
  public Item(String name, int attack, int defence, int intel) {
    
    this.name = name;
    this.attack = attack;
    this.defence = defence;
    this.intel = intel;
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
  public int getIntel() {
    return intel;
  }

  @Override
  public String toString() {
    return name + " - attack: " + attack + ", defence: " + defence+ ", intellidence: " + intel;
  }

}
