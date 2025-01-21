public class CartItem {
    private Book book;
    private int quantity;
 
    // Constructor
    public CartItem(Book book, int quantity) {
        this.book = book;
        if(quantity<=0){
            throw new IllegalArgumentException("quantity must be positive");
        }
        else{
            this.quantity = quantity;
        } 
    }
 
    // Getter for book
    public Book getBook() {
        return book;
    }
 
    // Setter for book (optional)
    public void setBook(Book book) {
        this.book = book;
    }
 
    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }
 
    // Setter for quantity (optional)
    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.out.println("negative quantity entered");
            return;
        }
        this.quantity = quantity;
    }
 
    // Calculate price for this item
    public double calculatePrice() {
        return book.getPrice() * quantity;
    }
 
    @Override
    public String toString() {
        return "CartItem{" +
                "book=" + book.getTitle() +
                ", quantity=" + quantity +
                ", price=" + calculatePrice() +
                '}';
    }
}