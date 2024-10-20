/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);
    
    public static String getString(){
       while(true){
           String result = sc.nextLine().trim();
           if(result.isEmpty()){
               System.err.println("Empty");
           } else {
               return result;
           }
       }
    }
    
    public static double getMark(String msg, int min, int max )
    {
        double n;
        while(true){
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine().trim());
                if(min <= n && n <= max)  break;
                   throw new NumberFormatException();               
            } catch (NumberFormatException e ) {
                System.err.println("Input mark is digit!");
                System.out.println("You must input mark in range [" + min + " -> " + max + "]");
            }
        }
        return n;
    }
}
