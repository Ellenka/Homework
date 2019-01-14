package academy.mate.homework12;

public class DataEngine {
  Hero hero1;
  Hero hero2;
  
  DataEngine(Hero hero1, Hero hero2) {
    this.hero1 = hero1;
    this.hero2 = hero2;
    
  }
  
  public void fight () {
    System.out.println(hero1.toString());
    System.out.println(hero2.toString());
    int fight = 0;
    
    int heroOneStroke = hero1.getNewStrike();
    int heroTwoStroke = hero2.getNewStrike();
    
    while(hero1.getHealth()>=0 && hero2.getHealth()>=0) {
      fight++;
      
      
      if (hero1.getStrike()<=hero2.getStrike()) {
        heroOneStroke = hero1.getStrike()+hero1.getItems()[0].getAttack();
      } else {
        heroTwoStroke = hero2.getStrike()+hero2.getItems()[0].getAttack();
      }
      if (hero1.getHealth()>0) {
        hero2.setHealth(hero2.getHealth()-heroOneStroke);
      }
      if (hero2.getHealth()>0) {
        hero1.setHealth(hero1.getHealth()-heroTwoStroke);
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.getMessage();
        
      }
      System.out.println();
      System.out.println("Fight: " +fight);
      System.out.println(hero1.toString());
      System.out.println("Remaining health: "+hero1.getHealth());
      System.out.println(hero2.toString());
      System.out.println("Remaining health: "+hero2.getHealth());
      
    }
    
    System.out.println();
   System.out.println(hero1.getHealth()<0&&hero2.getHealth()<0?"Both fighters are dead": 
     (hero1.getHealth()<0? hero2.getName()+" wins!": hero1.getName()+ " wins!"));
    
  }

}
