import java.util.*;


public class Lab5Q2 {
  public static void main(String[] args) {

    //Create an ArrayList of Integers
    List<Integer> randomNumbers = new ArrayList<Integer>();

    //Fill the ArrayList with ten random numbers (1-50)
    int pick;
    int max = 50;
    int min = 1;
    Random r = new Random();
    for (int i = 0; i<10; i++){
        pick = min + r.nextInt(max);
        randomNumbers.add(pick);
    }

    //Copy each value from the ArrayList into another ArrayList of the same capacity
    List<Integer> copyRandomNumbers = new ArrayList<Integer>();
    for (Integer o : randomNumbers){
      copyRandomNumbers.add(o);
    }
    
    //Change the last value in the first (original) ArrayList to a -5
    randomNumbers.set(9,-5);
    
    //Display the contents of both ArrayLists
    System.out.println("Original ArrayList: " + randomNumbers);
    System.out.println("Copy ArrayList: " + copyRandomNumbers);
  }
}
