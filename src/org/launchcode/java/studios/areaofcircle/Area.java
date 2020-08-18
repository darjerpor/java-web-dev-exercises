package org.launchcode.java.studios.areaofcircle;
import java.util.*;

public class Area {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a radius:");
      double r = input.nextDouble();
      input.close();

      double area = Circle.getArea(r);

      System.out.println("The area of a circle with radius " + r + " is: " + (area));
  }


}
