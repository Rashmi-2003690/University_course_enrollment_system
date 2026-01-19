/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahes
 */
public abstract class Person {
    private int index;
    private String name;
    private String address;
    private String phoneNo;
    public Person(int index, String name,String address,String phoneNo) {
        this.index = index;
        this.name = name;
        this.address= address;
        this.phoneNo=phoneNo;
    }
    // Encapsulated getters and setters
    public int getIndex(){ 
        return index; 
    }
    public String getName(){
        return name; 
    }
    public String getAddress(){
        return address; 
    }
     
    public String getPhoneNo(){
        return phoneNo; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setIndex(int index){
        this.index = index; 
    }
    public void setAddress(String address){
        this.address = address; 
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo; 
    }
    
    // Abstract method → Abstraction
    public abstract String displayInfo();
}

