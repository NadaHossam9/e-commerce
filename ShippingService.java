import java.util.*;

public class ShippingService {
    public static void shipItems(List<Shippable> itemShippables) {
        double totalWeight = 0;
        Map<String, Integer> itemCount = new LinkedHashMap<>();
        Map<String, Double> itemWeight = new HashMap<>();

        for (Shippable item : itemShippables) {
            String name = item.getName();
            itemCount.put(name, itemCount.getOrDefault(name, 0) + 1);
            itemWeight.put(name, item.getWeight());
            totalWeight += item.getWeight();
        }

System.out.println("** Shipment notice **");
   
for (String name : itemCount.keySet()) {
    int count = itemCount.get(name);
    double weightInKg = itemWeight.get(name);
    int weightInGrams = (int) (weightInKg * 1000);  
    System.out.println(count + "x " + name + " " + weightInGrams + "g");
        
}

System.out.println("Total package weight " + ((int)(totalWeight * 10)) / 10.0 + "kg");


}
}