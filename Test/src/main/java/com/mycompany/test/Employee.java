/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author shali
 */
public class Employee {
    private String empname;
   private int empage;
   private double empsalary;
   
   public Employee(String empname,int empage,double empsalary){
       this.empname=empname;
       this.empage=empage;
       this.empsalary=empsalary;
   }
   public void setempname(String empname){
       this.empname=empname;
   }
   public String getempname(){
       return empname;
   }
    public void setempage(int empage){
       this.empage=empage;
   }
   public int getempage(){
       return empage;
   }
    public void setempsalary(double empsalary){
       this.empsalary=empsalary;
   }
   public double getempsalary(){
       return empsalary;
   }


}
