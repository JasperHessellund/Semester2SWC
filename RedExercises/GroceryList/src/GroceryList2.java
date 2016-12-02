

import java.util.ArrayList;


public class GroceryList2 extends GroceryItemOrder {


    private ArrayList<String> list = new ArrayList<>();




    public void add (GroceryItemOrder item) {

        if (list.size() < 11) {
            list.add(item.toString());
        }

        else {
            System.out.println(list.size());
            System.out.println("Grocery list is full");

        }
    }
    public String getTotalCost() {


        for (String s : list) {

            System.out.println(s);
        }
        return "";
    }

}

