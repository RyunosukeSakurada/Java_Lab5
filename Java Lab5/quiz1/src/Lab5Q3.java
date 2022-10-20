import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Lab5Q3 {

    public static void main(String[] args){
      List<Car> carList = new ArrayList<>();

      carList.add(new Car("Nissan","GT-R",1993));
      carList.add(new Car("Toyota","Supra",1999));
      carList.add(new Car("Honda","NSX-R",2003));
      carList.add(new Car("Toyota","Prius",1997));
      carList.add(new Car("Honda","Vezel",2013));

      Collections.sort(carList);

      for(Car e : carList){
        System.out.println(e.year);
      }
    }
  }

  class Car implements Comparable<Car>{
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year){
      this.brand = brand;
      this.model = model;
      this.year = year;
    }

    @Override
    public int compareTo(Car o) {
      return this.year - o.year;
    }
  }
