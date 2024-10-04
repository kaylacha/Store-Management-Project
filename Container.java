/**
 * The Container class extends Ice to represent an ice cream container
 * It adds weight and brand
  */

/**
* weight of container
* brand of ice cream 
  */
public class Container extends Ice {
  private int weight; 
  private String brand; 

  //no argument 
  //calls the no argument constructor
  public Container() {
    super();
    this.weight = 0; 
    this.brand = "";
  }

  //paramterized constructor that sets flavor, price, weight, brand
  public Container (String flavor, double price, int weight, String brand) {
    super(flavor, price);
    this.weight = weight;
    this.brand = brand;
  }

  //accessor methods for weight
  public int getWeight() {
    return weight;
  }

  //accessor method for brand
  public String getBrand() {
    return brand;
  }

  //mutator method for weight
  public void setWeight(int weight) {
    this.weight = weight;
  }

  //mutator method for brand
  public void setBrand(String brand) {
    this.brand = brand;
  }

  //toString to display container details 
  public String toString() {
    return super.toString() + ", Weight: " + weight + " , Brand: " + brand;
  }
  



  
}