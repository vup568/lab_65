/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Student;
import java.util.*;
import java.util.Map;
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    ArrayList<Student> lt ;

    public Main() {
        lt = new ArrayList<>();
    }
    
    public static boolean checkYN(){
        while(true){
            String result = Validation.getString();
            if(result.length() == 1){
                char resultChar = result.charAt(0);
                if(resultChar == 'y' || resultChar == 'Y'){
                    return true;}
                if(resultChar == 'n' || resultChar == 'N'){
                    return false;}
            }
        }
   
    }    
    public static void AddStudent(List<Student> ls){
      
        while (true) {
            //name
            System.out.print("Name: ");
            String name = sc.nextLine();

            //Class 
            System.out.print("Class: ");
            String Class = sc.nextLine();

            double Math = Validation.getMark("Math: ", 0, 10);
            double physical = Validation.getMark("Physical: ", 0, 10);
            double chemistry = Validation.getMark("Chemistry: ", 0, 10);
            double avgMark = (Math + physical + chemistry) / 3;
            char type;
            if (avgMark >= 7.5) {
                type = 'A';
            } else if (avgMark >= 6 && avgMark <= 7.5) {
                type = 'B';
            } else if (avgMark >= 4 && avgMark < 6) {
                type = 'C';
            } else {
                type = 'D';
            }
            
           ls.add(new Student(name, Class, Math, physical, chemistry, avgMark, type));
            System.out.print("Do you want input more student(Y/N): ");
            if(!checkYN()){
                return;
            }
        }
    }
    private static HashMap<String, Double> getPercent(List<Student> ls)
    {
        HashMap<String, Double> PercentStudent = new HashMap<>();
        int totalStudent = ls.size();
        double typeA = 0;
         double typeB = 0;
          double typeC = 0;
           double typeD = 0;
           for(int i = 0; i < ls.size(); i++){
               if(ls.get(i).getType() == 'A')
               {
                   typeA++;
               } 
               if(ls.get(i).getType() == 'B')
               {
                   typeB++;
               }
               if(ls.get(i).getType() == 'C')
               {
                   typeC++;
               }
               if(ls.get(i).getType() == 'D')
               {
                   typeD++;
               }            
           }
           System.out.println("===== classification info =====");
           PercentStudent.put("A", typeA / totalStudent * 100);
           PercentStudent.put("B", typeB / totalStudent * 100);
           PercentStudent.put("C", typeC / totalStudent * 100);
           PercentStudent.put("D", typeD / totalStudent * 100);
           return PercentStudent;
    }
    
    public static void displayALL(List<Student> ls){
          int i = 0;
        for (Student student : ls) {
            System.out.println("***** Student " + (++i) + " info i*****");
            System.out.println("Name: " + student.getName());
            System.out.println("Class: " + student.getClassName());
            System.out.println("Avg: " + student.getAvg());
            System.out.println("Type: " + student.getType());
            System.out.println();
        }
    }
     public static void display() {
        
        List<Student> ls = new ArrayList<>();
       AddStudent(ls);
        displayALL(ls);
        HashMap<String, Double> getPercent = getPercent(ls);
        for(Map.Entry student : getPercent.entrySet())
        {
            System.out.println(student.getKey() + ":" + student.getValue() + "%");
        }
      
    }
 
    public static void main(String[] args) {
        System.out.println("######## Management Student ########");
        display();
    }
    
   
   
}
