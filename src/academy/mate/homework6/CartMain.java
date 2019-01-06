package academy.mate.homework6;

public class CartMain {
  public static void main(String [] args) {
    Product p1 = new Product("Coca cola", 10);
    Product p2 = new Product("Lays", 5);
    
    Customer customer = new Customer();
    Cart cart = new Cart();
    
    customer.addCart(cart);
    
    
    customer.addProduct(p1);
    cart.addProduct(p1);
    cart.addProduct(p2);
    cart.showCart();
    
    Cart c=customer.moveCart();
    c.showCart();
    
    cart.deleteProduct("lays");
    cart.deleteProduct("coca cola");
    cart.deleteProduct("coca cola");
    
  }

}
