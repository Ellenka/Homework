package academy.mate.homework4;

public class TaskTwo {
 public void formated() {
   System.out.printf("%-3c%-10s%-20s%-10s%n", '#', "currency", "description", "rate");
   // надо ли выводить вертикальный разделитель?
   System.out.println("--------------------------------------");
   System.out.printf("%-3d%-10s%-20s%-10.2f%n", 1, "USD", "US Dollar", 27.8);
   System.out.printf("%-3d%-10s%-20s%-10.2f%n", 1, "EUR", "EURO", 31.64);
   System.out.printf("%-3d%-10s%-20s%-10.2f%n", 1, "CAD", "Canadian dollar", 20.77);
   }
}
