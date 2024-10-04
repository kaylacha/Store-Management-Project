/**
  * The Ice class represents an ice cream item
  * Includes flavor, price, consturctors, acessor methods, mutator methods, toString
  *
  */


/**
  * flavor of ice cream
  * price of ice cream
  */
public class Ice {
  private String flavor; 
  private double price;
  
//no argyment initializes flavor to empty string and 0.0 price 
  public Ice() {
    this.flavor = "";
    this.price = 0.0;    
  }
  
  //paramterized constructor setting flavor and price 
   public Ice(String flavor, double price) {
    this.flavor = flavor;
    this.price = price;    
  } 

//accessor method for flavor
  public String getFlavor() {
    return flavor;
  }

  //acessor method for price 
  public double getPrice() {
    return price;
  }

  //mutator method for flavor 
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  //mutator method for price
  public void setPrice(double price) {
    this.price = price;
  }

  //toString method to display ice cream details 
  public String toString() {
    return "Flavor: " + flavor + "\nPrice: " + price;
  }





  
}