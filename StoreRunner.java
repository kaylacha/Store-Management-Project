import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    //Creating an Ice object with the flavor "vanilla" and the price of 4.5
   Ice ice = new Ice("Vanilla", 4.5);
   System.out.println(ice);

    //Creates a containter with the flavor chocolate, price 5.7, weight 267, and brand Haagen Dazs
    Container container = new Container("Chocolate", 5.7, 267, "Haagen Dazs");
   System.out.println(container);

    //Creates a Scoops object with flavor Strawberry, price 8.6, weight 240, brand Ben and Jerry's with 2 scoops 
    Scoops scoops = new Scoops("Strawberry", 8.6, 240, "Ben and Jerrys", 2);
   System.out.println(scoops);
    

    
    
  }
}