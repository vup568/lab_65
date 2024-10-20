/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

import java.util.HashMap;

public class NewClass {
    
    public static void main(String[] args) {
        HashMap<String, String> streetvn = new HashMap<>();
        //add new object into hashmap
        streetvn.put("Hanoi", "Hai Ba Trung");
         streetvn.put("Hung Yen", "Nguyen Van Linh");
         streetvn.put("Hcm", "Ta Quang Buu");
         
         System.out.println(streetvn);
         
         System.out.println();
         
         
         //Access an object in hashmap
         System.out.println("2.access object hanoi:  " + streetvn.get("Hanoi"));
         System.out.println("");
         
         //Remove object 
       streetvn.remove("Hung Yen");
         System.out.println("3.Remove Hung yen: " + streetvn);
                 
         System.out.println("");
         
         
         //Clear all hashmap
         streetvn.clear();
         
         //Hashmap size
         System.out.println(streetvn.size());
         
         //Loop through Hashmap 
         //Use keySet() if you want to access key 
         //Use values() if you want to access values  
         for( String i : streetvn.keySet()){
             System.out.println(i);
         }
  
        // Print keys and values
        for (String i : streetvn.keySet()) {
            System.out.println("key: " + i + " value: " + streetvn.get(i));
        }
        
        //Key and value must be object not primitive type. 
        //To use primitive you must change it into Wrapper Class. Ex: int -> Integer, ...
            HashMap<String, Integer> people = new HashMap<String, Integer>();
    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
    
    //EntrySet: Allow iterate over both the keys and values of the HashMap simultaneously using a single loop
    //Enable to modify the HashMap by removing or updating  key-value pairs through the Entry objects in the set view 
    //Syntax : HashMap_obj.enTry( entrySet no take parameters, it operate directly through exist instance in hashmap) 
    }
}
