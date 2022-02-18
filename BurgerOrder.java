/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen;

/**
 * Class that contains items to order on a burger
 * @author brianramirez
 * created September 8, 2021
 */ 
public class BurgerOrder {
    
    /**
     * declaring variables
     */
    private int numHamburgers= 0;
    private int numCheeseburgers=0;
    private int numVeggieburgers=0;
    private int numSodas=0;
    private boolean orderToGo;
    private int orderNum=5;
    
    /**
     * 
     * @param numHamburgers
     * @param numCheeseburgers
     * @param numVeggieburgers
     * @param numSodas
     * @param orderToGo
     * @param orderNum 
     */
public BurgerOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum)
{ 
    this.numHamburgers = numHamburgers; 
    this.numCheeseburgers = numCheeseburgers; 
    this.numVeggieburgers = numVeggieburgers; 
    this.numSodas = numSodas; this.orderToGo = orderToGo; 
    this.orderNum = orderNum; 
}
 

/**
 * Getter for Hamburgers
 * @return number of Hamburgers
 */
 public int getnumHamburgers() {
    return numHamburgers;
}
 
 /**
  * setter for Hamburgers
  * @param num that is an integer 
  */
public void setnumHamburgers(int num){
    if (num <0) {
        System.out.println("Error: you cannot order less than zero burgers.");
    } else {
        this.numHamburgers = num;
    } 
}

 /**
  * getter for Cheeseburgers
  * @return number of Cheeseburgers
  */
public int getnumCheeseburgers() {
    return numCheeseburgers;
}

/**
 * setter for Cheeseburgers
 * @param num that is an int
 */
public void setnumCheeseburgers(int num) {
    if (num < 0) {
        System.out.println("Error: you cannot order less than zero burgers.");
    } else {      
    this.numCheeseburgers = num;
    }
}

/**
 * getter for Veggieburgers
 * @return number of Veggieburgers
 */
public int getnumVeggieburgers() {
    return this.numVeggieburgers;
}

/**
 * setter for Veggieburgers
 * @param num that is an int
 */
public void setnumVeggieburgers(int num) {
    if (num < 0) {
        System.out.println("Error: you cannot order less than zero burgers.");
    } else {      
    this.numVeggieburgers = num;
   }
}

/**
 * getter for Sodas
 * @return 
 */
public int getnumSodas() {
    return this.numSodas;
}

/**
 * setter for Sodas
 * @param num that is an int 
 */
public void setnumSodas(int num) {
    if (num < 0) {
        System.out.println("Error: you cannot order less than zero sodas.");
    } else {       
    this.numSodas = num;
    }
}

/**
 * getter for OrderToGo
 * @return false or true, depending if it is Togo
 */
public boolean isOrderToGo() {
    return orderToGo;
}
/**
 * setter for OrderToGo
 * @param decision that is a boolean
 */
public void setOrderToGo(boolean decision){
    this.orderToGo = decision; 
}
/**
 * getter for OrderNum
 * @return Order number
 */
public int getOrderNum() {
    return orderNum;
}
/**
 * setter for OrderNum
 * @param num that is an int
 */
public void setOrderNum(int num) {
    this.orderNum = num;
}
/**
 * method that adds all the types of burgers
 * @return number of total burgers
 */
    public int getBurgerTotal(){
       int burgers = getnumVeggieburgers() + getnumHamburgers() + getnumHamburgers();
       
       return burgers;
  
    }

/**
 * prints out all the fields names and their current values
 * @return int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderTogo, int ordernum 
 */
    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo + ", orderNum=" + orderNum + '}';
    }

}







