/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codewars;

/**
 *
 * @author User
 */
public class SmallestIntegerFinder {
    public static void main(String[] args) {
      int[]nilai ={34,15,88,2}; 
      int smallest = findSmallestInt(nilai);
      System.out.println("The smallest integer is " + smallest);
    }
    public static int findSmallestInt (int[] args) {
        int smallest = args[0];
        for (int i = 1; i < args.length; i++){
            if (args[i] < smallest){
                smallest = args[i];
            }
        }
        return smallest;   
  }
}


