/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author shali
 */
public class Test {

    public static void main(String[] args) {
       Employee e1=new Employee();
        e1.seta(28500);
        e1.setempname("bogdan");
        e1.setempdes("colombo");
        System.out.println("name is:"+e1.getempid());
        System.out.println("age is:"+e1.getempname());
        System.out.println("salary is:"+e1.getempdes());
         Employee e2=new Employee();
        e2.seta(28500);
        e2.setempname("bird");
        e2.setempdes("colombo");
        System.out.println("name is:"+e2.getempid());
        System.out.println("age is:"+e2.getempname());
        System.out.println("salary is:"+e2.getempdes());
    }
    
}
