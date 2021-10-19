package hackerrank;

import java.util.HashMap;


public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	private  HashMap<Furniture,Integer >  orders = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     * 
     * Furniture
     */
	Furniture order ;
	
    FurnitureOrder() {
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	orders.put(type, furnitureCount);
    	order=type;
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return orders;
    }

    public float getTotalOrderCost() {
    //	orders.get(order);
    //	System.out.println(orders.get(order));
    //	System.out.println(order.cost());
    	
    	float orderbill = orders.get(order) * order.cost();
        return orderbill;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return orders.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return orders.size();
    }
    

    
}