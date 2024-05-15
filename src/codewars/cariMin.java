package codewars;

public class cariMin {

   
    public static void main(String[] args) {
     int [] data = {8,3,10,2,38,0};
     
     int exampleVar = data.length;
     
     for (int nilai : data){
         if(nilai < exampleVar){
             exampleVar = nilai;
         }
     }
        System.out.println(exampleVar);
    }
    
}
