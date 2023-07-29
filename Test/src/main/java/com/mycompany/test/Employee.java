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
   
   public void setvalue(String a,int b,double c){
       empname=a;
       empage=b;
       empsalary=c;
   }
   public void seta(String a){
       empname=a;
   }
   public String geta(){
       return empname;
   }
    public void setb(int b){
       empage=b;
   }
   public int getb(){
       return empage;
   }
    public void setc(double c){
       empsalary=c;
   }
   public double getc(){
       return empsalary;
   }

}
