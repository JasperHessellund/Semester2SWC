
public class GroceryItemOrder {

    String item = "";
    int quantity = 1;
    double price = 0;

    public GroceryItemOrder () {

    }
    //Getters and setters
    public GroceryItemOrder(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public GroceryItemOrder(String item) {
        this.item = item;
    }



    public String getName() {
        return item;
    }

    public void setName(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost () {
        return quantity*price;

    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "Item: '" + item + ", " +
                "quantity: " + quantity +
                ", price: " + price +
                '}';
    }
}
