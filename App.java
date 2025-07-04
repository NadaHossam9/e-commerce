import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
       
        System.out.println(" Use Case 1 : Normal Checkout ");
        Cheese cheese = new Cheese("Cheese", 100, 5, 0.2, LocalDate.of(2025, 12, 1));
        TV tv = new TV("TV", 300, 5, 5.0);
        Biscuits biscuits = new Biscuits("Biscuits", 150, 2, LocalDate.of(2025, 12, 1), 0.7);
        Customer customer = new Customer("Nada", 1000);
        Cart cart = new Cart();
        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        CheckOut.checkout(customer, cart);

      
        System.out.println("\n Use Case 2: Expired Product ");
        Biscuits expiredBiscuits = new Biscuits("Old Biscuits", 150, 2, LocalDate.of(2023, 12, 1), 0.7);
        Customer customer2 = new Customer("jana", 1000);
        Cart cart2 = new Cart();
        cart2.addProduct(expiredBiscuits, 1);
        CheckOut.checkout(customer2, cart2); 

        System.out.println("\n Use Case 3: Out of Stock ");
        Cart cart3 = new Cart();
        cart3.addProduct(cheese, 10); 
        CheckOut.checkout(customer, cart3);  

        
        System.out.println("\n Use Case 4: Insufficient Balance");
        Customer poorCustomer = new Customer("mariem", 50);
        Cart cart4 = new Cart();
        cart4.addProduct(biscuits, 1);
        CheckOut.checkout(poorCustomer, cart4); 

        Mobile mobile = new Mobile("samsung", 1000, 1);
        Customer richCustomer = new Customer("farah", 2000);
        Cart cart5 = new Cart();
        cart5.addProduct(mobile, 1);
        CheckOut.checkout(richCustomer, cart5);  
      
        System.out.println("\n Use Case 5: Empty Cart ");
        Cart emptyCart = new Cart();
        Customer customerEmpty = new Customer("shaza", 500);
        CheckOut.checkout(customerEmpty, emptyCart);  
    }
}


