/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahes
 */
public class Student extends Person{
    private String course_1;
    private String course_2;
    private String course_3;

    public Student(int index, String name,String address,String phoneNo, String course_1,String course_2,String course_3) {
        super(index, name,address,phoneNo);
        this.course_1 = course_1;
        this.course_2 = course_2;
        this.course_3 = course_3;
    }

    public String getCourse_1() {
        return course_1; 
    }
    public void setCourse_1(String course_1) { 
        this.course_1 = course_1; 
    }
    public String getCourse_2() {
        return course_2; 
    }
    public void setCourse_2(String course_2) { 
        this.course_1 = course_2; 
    }
    public String getCourse_3() {
        return course_3; 
    }
    public void setCourse_3(String course_3) { 
        this.course_3 = course_3; 
    }

    // Polymorphism (method overriding)
    @Override
    public String displayInfo() {
        return  "Student Index : " + getIndex() + "\n" +
                "Name       : " + getName() + "\n" +
                "Address    : " + getAddress() + "\n" +
                "Phone      : " + getPhoneNo() + "\n" +
                "-----------------------------\n";
    }

}
