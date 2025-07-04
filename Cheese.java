import java.time.LocalDate;

public class Cheese extends Product implements Expirable,Shippable {
  private double weight;
 private LocalDate expirationDate;
  public Cheese(String name,double price,int quantity,double weight,LocalDate expirationDate){
    super(name, price, quantity);
    this.weight=weight;
    this.expirationDate=expirationDate;
  }
    @Override
    public double getWeight() {
        return weight;
        
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean Isexpired() {
        return LocalDate.now().isAfter(expirationDate);
       
    }
    
}
