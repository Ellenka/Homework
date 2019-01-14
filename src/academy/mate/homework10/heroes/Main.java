package academy.mate.homework10.heroes;

public class Main {public static void main (String[] args) {
  
  Hero one = new HeroOne("First", (int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));
  Hero two = new HeroTwo("Second",(int)(Math.random()*30),(int)(Math.random()*20),(int)(Math.random()*10));
  
  DataEngine data = new DataEngine (one, two);
  data.fight();
  
}
}
