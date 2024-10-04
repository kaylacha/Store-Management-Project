/** 
 * The Scoops class extends the Container to represent a specific number of ice cream scoops 
  *adds number of scoops and methods
  */

//number of scoops 
public class Scoops extends Container {
  private int numOfScoops;

  //parameterized constructor that calls container constructor 
  public Scoops() {
    super();
    this.numOfScoops = 0;
  }

  //parameterized constructor that calls container constructor 
  public Scoops(String flavor, double price, int weight, String brand, int numOfScoops) {
    super(flavor, price, weight, brand);
    this.numOfScoops = numOfScoops;
  }

  //accessor method for number of scoops 
  public int getNumOfScoops() {
    return numOfScoops;
  }

  //mutator method for scoops 
  public void setNumOfScoops(int numOfScoops) {
    this.numOfScoops = numOfScoops;
  }

  //toString to display scoop details 
  public String toString() {
    return super.toString() + ", Scoops: " + numOfScoops;
  }




  
}