import java.util.HashMap;
public class Cart {
    private HashMap<Product,Integer> items=new HashMap<>();
   public void addProduct(Product product,int quantity){
    if(quantity <= product.getQuantity()){
        items.put(product, quantity);
    }
    else {
        System.out.println("Error: " + product.getName() + " is out of stock");
    }
}

    public HashMap<Product,Integer> getItems(){
        return items;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public void cartContent(){
       if(items.isEmpty()){
        System.out.println("cart is empty");
       }
       else{
        System.out.println("cart contents: ");
        for(Product p :items.keySet()){
          System.out.println(items.get(p)+" "+p.getName()+" ");
        }

       }
    }
}
