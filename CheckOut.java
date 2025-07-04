import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckOut {
    public static void checkout(Customer customer,Cart cart){
       if(cart.isEmpty()){
        System.out.println(" cart is empty, cannot checkout");
        return;
       }
       HashMap<Product,Integer> items=cart.getItems();
       double subtotal=0;
       double shippingFees=0;
       final double FeesPerItem=10.0;
       List <Shippable> itemsToBeShipped=new ArrayList<>();
       for(Product product:items.keySet()){
        int quantity= items.get(product);
        
       if(product instanceof Expirable expirable && expirable.Isexpired()){
    System.out.println("Error: " + product.getName() + " cannot be added its expired");
    return;
}

     if(quantity > product.getQuantity()){
    System.out.println("Error: " + product.getName() + " is out of stock");
    return;
}

       subtotal+=product.getPrice()*quantity;

       if(product instanceof Shippable){
        for(int i=0;i<quantity;i++){
            itemsToBeShipped.add((Shippable)product);
        }
       }
       
    }
       shippingFees=itemsToBeShipped.size()*FeesPerItem;
       double total= subtotal+shippingFees;

      if(total > customer.getBalance()){
    System.out.println("Payment Error: Insufficient balance");
    return;
}

       customer.pay(total);

       if(!itemsToBeShipped.isEmpty()){
        ShippingService.shipItems(itemsToBeShipped);
       }
      
       System.out.println("** Checkout receipt **");
       for(Product product:items.keySet() ){
        int quantity=items.get(product);
      System.out.println(quantity + "x " + product.getName() + " " + (int)product.getPrice());


        product.reduceQuantity(quantity);
       }
        System.out.println("----------------------");
        System.out.println("Subtotal " + (int)subtotal);
        System.out.println("Shipping " + (int)shippingFees);
        System.out.println("Amount " + (int)total);

      
    }
}
