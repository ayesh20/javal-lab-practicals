
package com.mycompany.alloop;


public class checkingAccount extends Bankaccount {
     double interest;
   public double calculateInterest() {
         interest=getBalance()*0.02;
         return interest;
    } 
}
