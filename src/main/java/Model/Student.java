/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author ADMIN
 */
public class Student {
private String name;
private String ClassName;
private double mathMark, physicalMark, chemistryMark, avg;
private char type;

    public Student() {
    }

    public Student(String name, String ClassName, double mathMark, double physicalMark, double chemistryMark, double avg, char type) {
        this.name = name;
        this.ClassName = ClassName;
        this.mathMark = mathMark;
        this.physicalMark = physicalMark;
        this.chemistryMark = chemistryMark;
        this.avg = avg;
        this.type = type;
    }

    public double getAvg() {
        return avg;
    }
    
    public char getType(){
        return type;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return ClassName;
    }

    public double getMathMark() {
        return mathMark;
    }

    public double getPhysicalMark() {
        return physicalMark;
    }

    public double getChemistryMark() {
        return chemistryMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public void setPhysicalMark(double physicalMark) {
        this.physicalMark = physicalMark;
    }

    public void setChemistryMark(double chemistryMark) {
        this.chemistryMark = chemistryMark;
    }
    
   



 

   
}
