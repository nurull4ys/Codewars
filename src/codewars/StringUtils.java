/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codewars;

/**
 *
 * @author User
 */
public class StringUtils {
    public static void main(String[] args) {
        
    }
    public static String toAlternativeString(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            
            if (Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
