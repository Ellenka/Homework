package academy.mate.homework6;

public class Cart {
  Product [] products = new Product[10];
  
  void addProduct(Product product) {
    for (int i = 0; i<products.length; i++) {
      if(products[i] == null) {
        products[i] = product;
        break;
      }
    }
  }
  void showCart() {
    int counter = 1;
    for (int i = 0; i<products.length; i++) {
      if (products[i]!=null) {
        System.out.println((counter++)+". "+products[i].getName()+", "+products[i].getPrice());
      }
    }
  }
  
  void deleteProduct (String pname) {
    int sum = 0;
    
    for (int i = 0; i<products.length; i++) {
      if(products[i]!=null && pname.equalsIgnoreCase(products[i].getName())) {
        products[i] = null;
        break;
      } else {
        continue;
      }
    }
    for (Product p: products) {
      if (p!=null) {
        sum +=p.getPrice();
        }
      }
    if (sum!=0) {
      System.out.println("Total amount is: "+sum);
      } else {
        System.out.println("Cart is empty");
        
        }
    }
  }