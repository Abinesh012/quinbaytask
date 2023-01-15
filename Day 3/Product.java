public class Product {
    private int id;
    String name;

    long price;
    int stock;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(int id, String name, long price, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

}
