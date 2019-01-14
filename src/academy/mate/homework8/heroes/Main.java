package academy.mate.homework8.heroes;

public class Main {
  public static void main (String[] args) {
    
    Hero heroOne = new Hero("First", (int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));
    Hero heroTwo = new Hero("Second",(int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));

    System.out.println(heroOne.toString());
    System.out.println(heroTwo.toString());
    int fight = 0;
    
    int heroOneStroke = heroOne.getStrike();
    int heroTwoStroke = heroTwo.getStrike();
    
    while(heroOne.getHealth()>=0 && heroTwo.getHealth()>=0) {
      fight++;
      
      
      if (heroOne.getStrike()<=heroTwo.getStrike()) {
        heroOneStroke = heroOne.getStrike()+heroOne.getItems()[0].getAttack();
      } else {
        heroTwoStroke = heroTwo.getStrike()+heroTwo.getItems()[0].getAttack();
      }
      if (heroOne.getHealth()>0) {
        heroTwo.setHealth(heroTwo.getHealth()-heroOneStroke);
      }
      if (heroTwo.getHealth()>0) {
        heroOne.setHealth(heroOne.getHealth()-heroTwoStroke);
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.getMessage();
        
      }
      System.out.println();
      System.out.println("Fight: " +fight);
      System.out.println(heroOne.toString());
      System.out.println("Remaining health: "+heroOne.getHealth());
      System.out.println(heroTwo.toString());
      System.out.println("Remaining health: "+heroTwo.getHealth());
      
    }
    
    System.out.println();
   System.out.println(heroOne.getHealth()<0&&heroTwo.getHealth()<0?"Both fighters are dead": 
     (heroOne.getHealth()<0? heroTwo.getName()+" wins!": heroOne.getName()+ " wins!"));
  }

}
