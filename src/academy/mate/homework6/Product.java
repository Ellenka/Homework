package academy.mate.homework6;

public class Product {
  String name;
  int price;
  
  Product(String n, int p) {
    name = n;
    price = p;
  } 
  
  int getPrice() {
    return price;
  }
  
  String getName() {
    return name;
  }

}
