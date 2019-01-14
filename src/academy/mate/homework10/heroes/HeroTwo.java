package academy.mate.homework10.heroes;

public class HeroTwo extends Hero {
  

  
  HeroTwo(String name, int intelligence, int agility, int strength) {
    super(name, intelligence, agility, strength);
    
    
  }

  @Override
  public int getNewStrike() {
    return getStrike()+getItems()[2].getDefence();
  }
 

}
