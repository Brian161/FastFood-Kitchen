/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen;

import java.util.ArrayList;


/**
 * Class for FastFoodKitchen 
 * 
 * @author brian
 * created September 8, 2021
 */
public class FastFoodKitchen {
    
private ArrayList<BurgerOrder> orderList = new ArrayList<>();

private static int nextOrderNum;

/**
 * Method that increments to the orderList
 */

public FastFoodKitchen() {
    orderList.add(new BurgerOrder(3, 5, 4, 10, false, 1));
    incrementNextOrderNum();
    orderList.add(new BurgerOrder(0, 0, 3, 3, true, 2));
    incrementNextOrderNum();
    orderList.add(new BurgerOrder(1, 1, 0, 2, false, 3));
    incrementNextOrderNum();

    
}
/**
 * Method that finds the position of the order
 * @param orderID int that holds orderID
 * @return value of i
 */
public int findOrderSeq(int orderID) {
    for (int i =0; i<orderList.size(); i++) {
        if(orderList.get(i).getOrderNum() == orderID) {
            return i;
        }
    }
    return -1;
}
/**
 * Method that finds position of the order using binary search
 * @param orderID int that holds orderID
 * @return position of the order
 */
    public int findOrderBin(int orderID) {
        int left = 0;
        int right = orderList.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (orderID < orderList.get(middle).getOrderNum()) {
                right = middle - 1;
            } else if (orderID > orderList.get(middle).getOrderNum()) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    /**
     * Method that sorts arraylist using selectionsort
     */
    public void selectionSort() {
        for (int i = 0; i < orderList.size()- 1; i++) {
            int indexSmallest = i;
            for (int j = i + 1; j < orderList.size(); j++) {
                if(orderList.get(j).getBurgerTotal() < orderList.get(indexSmallest).getBurgerTotal()) {
                   
                    indexSmallest = j;
                }         
            BurgerOrder temp = orderList.get(i);            
            orderList.set(i, orderList.get(indexSmallest));            
            orderList.set(indexSmallest, temp);                  
        }    
    }
 }

    
    /**
     * Method that sorts arraylist using insertion sort
     */
    public void insertionSort() {
        for (int i = 1; i < orderList.size(); i++){
            int j = i;
            while (j > 0 && orderList.get(j).getBurgerTotal() < orderList.get(j-1).getBurgerTotal()){
                //swap numbers
                BurgerOrder temp = orderList.get(j);
                orderList.set(j, orderList.get(j-1));
                orderList.set(j-1, temp);
                
                j--;
            }
        }   
   } 
/**
 * Getter returning the Next Order Number
 * @return the nextOrderNum 
 */
public static int getNextOrderNum() {
        return nextOrderNum;
    }

    /**
     * Method that increases OrderNum
     */
private static void incrementNextOrderNum() {
        nextOrderNum++;
    }
    
    /**
     * 
     * @param ham int which holds the number of hamburgers
     * @param cheese int which holds number of cheeseburgers in the order 
     * @param veggie int which holds number of veggieburgers in the order
     * @param soda int which holds number of sodas in the order
     * @param toGo boolean which tells if the order is to go
     * @return next order number after it increases with this order
     */
    
public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
    orderList.add(new BurgerOrder(ham, cheese, veggie, soda, toGo, getNextOrderNum()));
    incrementNextOrderNum();
    return getNextOrderNum();   
}
/**
 * This method tells number of orders pending
 * @return order list size gives number of orders that are pending
 */
public int getNumOrdersPending() {
    return orderList.size();
}
/**
 * This method cancels last order by removing it from array list,then decreasing nextOrderNum
 * @return represents whether cancellation was successful or not 
 */
public boolean cancelLastOrder() {
    if (orderList.size() == 0){
        return false;
    } else {
        orderList.remove(orderList.size()-1);
        nextOrderNum -= 1;
        return true;
    }
}
/**
 * This method cancels a specific order
 * @param orderID
 * @return a boolean that represents if it is cancelled or not
 */
public boolean cancelOrder(int orderID) {
    for (int i = 0; i < orderList.size(); i++) {
        if (orderID == orderList.get(i).getOrderNum()) {
            orderList.remove(i);
            return true;
        }
    }
    return false;
}

/**
 * prints out all the fields names and their current values
 * @return the orderList printed
 */

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }



}



