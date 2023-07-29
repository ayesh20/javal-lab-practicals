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
        Employee sc=new Employee();
        sc.seta("kasun");
        sc.setb(20);
        sc.setc(25000.0);
        System.out.println("name is:"+sc.geta());
        System.out.println("age is:"+sc.getb());
        System.out.println("salary is:"+sc.getc());
    }

    
}
