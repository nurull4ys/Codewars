/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codewars;

/**
 *
 * @author User
 */
public class counting {
    public static void main(String[] args) {
        
    }
   // public class Counter { berhasil di wars
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    int count = 0;
    for(Boolean sheep : arrayOfSheeps){
      if(sheep!= null & sheep){
        count++;
      }
    }
    return count;
  }
}
}
