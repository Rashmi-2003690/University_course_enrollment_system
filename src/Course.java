/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahes
 */
public class Course {
  
    String name;
    String code;
    int fee;
    int duration;
    String lecName;
    
    public Course(String name, String code, int fee, int duration, String lecName){
        this.name = name;
        this.code = code;
        this.fee = fee;
        this.duration = duration;
        this.lecName = lecName;
    }
    
    
    
    public String displayInfo(){
       return   "Course Name : " + name + "\n" +
                "Code        : " + code + "\n" +
                "Fee         : " + fee + "\n" +
                "Duration    : " + duration + " months\n" +
                "-----------------------------\n";
        
    }

    
    
    
    
}
