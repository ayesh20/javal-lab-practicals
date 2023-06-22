
package com.mycompany.alloop;


public class Savingaccount extends Bankaccount{
   
    double interest;
   public double calculateInterest() {
         interest=getBalance()*0.12;
         return interest;
    } 
}
