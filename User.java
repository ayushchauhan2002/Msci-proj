import java.util.ArrayList;
import java.util.List;
 
public class User {
    private String name;
    private String email;
    private final List<Order> orderHistory;
 
    // Constructor
    public User(String name, String email) {
    this.name = name;
    this.email = email;
    this.orderHistory = new ArrayList<>();
    }
 
    // Getters and Setters
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
this.email = email;
    }
 
    public List<Order> getOrderHistory() {
        return orderHistory;
    }
 
    // Methods
    public void addToOrderHistory(Order order) {
        orderHistory.add(order);
    }
 
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
