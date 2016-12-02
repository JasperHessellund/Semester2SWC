public class RunProgram {


    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        GroceryList2 list2 = new GroceryList2();




        list.add(new GroceryItemOrder("Bubble Gum", 2, 0.50));
        list.add(new GroceryItemOrder("Orange", 5, 3.00));
        list.add(new GroceryItemOrder("Cheese", 1, 50.00));
        list.add(new GroceryItemOrder("Yogurt", 3, 15.00));
        list.add(new GroceryItemOrder("Garlic", 3, 5.00));
        list.add(new GroceryItemOrder("Bread", 1, 20.00));
        list.add(new GroceryItemOrder("Ginger", 1, 14.00));
        list.add(new GroceryItemOrder("Spagetti", 1, 4.00));
        list.add(new GroceryItemOrder("Sesame seeds", 2, 25.00));
        list.add(new GroceryItemOrder("Cream cheese", 5, 15.00));
        list.add(new GroceryItemOrder("Tomato soup", 1, 6.00));

        System.out.println(list.getTotalCost());
        list2.add(new GroceryItemOrder("Bubble Gum", 2, 0.50));
        list2.add(new GroceryItemOrder("Orange", 5, 3.00));
        list2.add(new GroceryItemOrder("Cheese", 1, 50.00));
        list2.add(new GroceryItemOrder("Yogurt", 3, 15.00));
        list2.add(new GroceryItemOrder("Garlic", 3, 5.00));
        list2.add(new GroceryItemOrder("Bread", 1, 20.00));
        list2.add(new GroceryItemOrder("Ginger", 1, 14.00));
        list2.add(new GroceryItemOrder("Spagetti", 1, 4.00));
        list2.add(new GroceryItemOrder("Sesame seeds", 2, 25.00));
        list2.add(new GroceryItemOrder("Cream cheese", 5, 15.00));
        list2.add(new GroceryItemOrder("Tomato soup", 1, 6.00));

        System.out.println(list2.getTotalCost());
    }

    
}
