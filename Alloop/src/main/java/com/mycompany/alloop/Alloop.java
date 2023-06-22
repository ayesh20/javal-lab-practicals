
package com.mycompany.alloop;

public class Alloop {

    public static void main(String[] args) {
       
       checkingAccount c1 = new checkingAccount(); 
        Savingaccount s1=new Savingaccount();
      
        c1.setAccountNumber(24596);
        c1.setBalance(20000000);
        System.out.println("Account Number:"+c1.getAccountNumber());
        System.out.println("Interest of Checking Account:"+c1.calculateInterest());
        
        s1.setAccountNumber(24596);
        s1.setBalance(1000000);
        System.out.println("Interest of Saving Account:"+s1.calculateInterest());
    }
}
