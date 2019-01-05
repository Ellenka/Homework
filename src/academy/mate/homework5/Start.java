package academy.mate.homework5;

public class Start {
  public static void main (String[] args) {
    PowerSupply power = new PowerSupply();
    power.getInfo();
    
    power.inputVoltage = 100;
    power.turnOn();
    power.getInfo();
    
    /*power.inputVoltage = 300;
    power.turnOn();
    power.getInfo();
    
    power.inputVoltage = */
  }
}

