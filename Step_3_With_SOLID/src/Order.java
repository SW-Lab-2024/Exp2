import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    String customerName;
    ArrayList<Food> foods = new ArrayList<>();
    LocalDateTime orderDate = LocalDateTime.now();

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addItem(Food food) {
        this.foods.add(food);
    }

    public int getTotalPrice() {
        return this.foods.stream().mapToInt(food -> food.price).sum();
    }

    @Override
    public String toString() {
        StringBuilder orders = new StringBuilder();
        for (Food food : this.foods) {
            orders.append(food.foodName).append(" -> ").append(food.price).append("\n");
        }
        return "Customer: " + customerName + "\nOrders are: \n" + orders + "\nTotal Price: " + this.getTotalPrice();
    }
}
