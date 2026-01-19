/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahes
 */
public class Lecturer extends Person{
     private String course;

    public Lecturer(int index, String name,String address,String phoneNo,String course) {
        super(index, name , address, phoneNo);
        this.course = course;
    }

    public String getCourse() { 
        return course; 
    }
    public void setCourse(String course) { 
        this.course = course;
    }
    

    @Override
    public String displayInfo() {
         return "Lecturer Index : " + getIndex() + "\n" +
                "Name        : " + getName() + "\n" +
                "Address     : " + getAddress() + "\n" +
                "PhoneNo       : " + getPhoneNo() + "\n" +
                "-----------------------------\n";
                           
    } 

}
