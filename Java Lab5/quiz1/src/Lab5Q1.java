import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab5Q1 {

  public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();

    values.add(10);
    values.add(20);
    values.add(30);
    values.add(46);
    values.add(13);
    values.add(28);
    values.add(6);
    values.add(2);
    values.add(37);
    values.add(41);

    for(Integer value : values){
      System.out.println(value);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int i = scanner.nextInt();
    scanner.close();

    boolean ans = values.contains(i); 
        if (ans){
          System.out.println("the number is in the list"); 
        }else{
          System.out.println("the number is not in the list"); 
        }
	}
}
