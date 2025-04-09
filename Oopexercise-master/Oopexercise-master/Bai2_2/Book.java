package Bai2_2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        StringBuilder sb = new StringBuilder();
        for (Author author : authors) {
            sb.append(author.getName()).append(", ");
        }
        return sb.toString().trim();
    }
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + getAuthorNames() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
