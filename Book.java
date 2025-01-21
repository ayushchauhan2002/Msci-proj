public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private double discountPercentage;
    private String category;
 
    // Constructor
    public Book(int bookId, String title, String author, double price,double discountPercentage, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.discountPercentage=discountPercentage;
        this.category = category;
    }
 
    // Getters and Setters
    public int getBookId() {
        return bookId;
    }
 
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercentage(){
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage=discountPercentage;
    }
 
    public String getCategory() {
        return category;
    }
 
    public void setCategory(String category) {
        this.category = category;
    }
 
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", discount=" + discountPercentage +
                ", category='" + category + '\'' +
                '}';
    }
}