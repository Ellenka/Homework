package academy.mate.homework5;

public class PowerSupply {
  boolean state;
  int inputVoltage;
  int ouptputVoltage1;
  int ouptputVoltage2;
  
  public void getInfo() {
    System.out.println("Power Supply is: "+(state ? "ON":"OFF")+", Input Voltage is: "+inputVoltage+" , ");
      
  }
  public void turnOn() {
    state = (inputVoltage>200 &&inputVoltage<250)?  true: false;
    if (inputVoltage<200)
      System.out.println("LOW VOLTAGE");
    if (inputVoltage>250)
      System.out.println("HIGH VOLTAGE");
    }
  }
