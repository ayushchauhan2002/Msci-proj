import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();
    private double totalCost;
 
    public void addItem(CartItem item) {
        items.add(item);
    }
 
    public void removeItem(CartItem item) {
        if(!items.contains(item)){
            System.out.println("item not present in your cart");
            return;
        }
        if(item.getQuantity()==1){
            items.remove(item);
            return;
        }
        else{
            item.setQuantity(item.getQuantity()-1);
        }
    }
 
    public double calculateTotalCost() {
        totalCost = items.stream().mapToDouble(CartItem::calculatePrice).sum();
        return totalCost;
    }
    
    public double getDiscountedTotalCost() {
        items.forEach(item -> totalCost-=(item.getBook().getDiscountPercentage()/100)*item.getQuantity()*item.getBook().getPrice());
        return totalCost;
    }
 
    public List<CartItem> getItems() {
        return items;
    }
}