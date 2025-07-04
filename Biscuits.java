import java.time.LocalDate;

public class Biscuits extends Product implements Expirable, Shippable {
    private LocalDate expirationDate;
    private double weight;

    public Biscuits(String name, double price, int quantity, LocalDate expirationDate, double weight) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    @Override
    public boolean Isexpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
