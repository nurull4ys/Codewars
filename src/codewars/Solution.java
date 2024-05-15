/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codewars;

/**
 *
 * @author User
 */
class Solution {
    public static void main(String[] args) {
        String in = "Assalamu'alaikum!";
        String result = removeExclamationMarks(in);
        System.out.println("String awal "+ in);
        System.out.println("String akhir "+ result);
    }
    
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }
}


