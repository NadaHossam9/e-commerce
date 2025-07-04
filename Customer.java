public class Customer {
   private String name;
   private double balance;
   public Customer(String name, double balance){
    this.name=name;
    this.balance=balance;
   }
 public double getBalance(){
    return balance;
 }
 public String getName(){
   return name;
 }
 public void pay( double amount){
    if(amount<=balance){
        this.balance-=amount;
    }
    else{
        System.out.println("payment failed ,not enough money");
    }
 }
 
}
