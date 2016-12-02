
import java.text.DecimalFormat;
import java.util.Arrays;

public class GroceryList {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    private GroceryItemOrder[] list = new GroceryItemOrder[10];
    private int index = 0;

    public GroceryList() {
    }

    public void add (GroceryItemOrder item) {

        if (index < 10) {
            list[index] = item;
            index++;
        }

        else {
            System.out.println("Grocery list is full");

        }
    }

    public String getTotalCost() {
        double totalCost = 0;

        for (int i = 0; i <= index-1; i++){
            totalCost+= list[i].getCost();
            System.out.println("Item: " + list[i].getName() + ", quantity: " + list[i].getQuantity() + ", price: " + df2.format(list[i].getPrice()) + " DKK" );
            System.out.println("\t\t" + df2.format(list[i].getCost()) +" DKK");
            System.out.println();
        }
        return "Total cost = " + totalCost + " DKK";
    }

    @Override
    public String toString() {
        return "Controller.GroceryList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}

