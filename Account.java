import java.util.Scanner;
 
 public class Account {
    private String name; 
    private double balance;


public Account(String name, double balance) {
    this.name = name; 
        if (balance > 0.0) {     
            this.balance = balance; 
       }                                                                    
   }


public void deposit(double depositAmount) {                      
    if (depositAmount > 0.0) { 
        balance += depositAmount; 
  }                                                              
}     

public void withdrawal (double withdrawalAmount) {
    if (withdrawalAmount > balance) {
        System.out.println("The amount choosen exceeds your available balance.");
        
    }
    else {
        balance -= withdrawalAmount;
        System.out.println("Your withdrawal amount is " + withdrawalAmount + ". Your new balance is " + balance + ".");
        
    }
    }

public double getBalance() {         
    return balance;                     
}                                    

public void setName(String name) {
    this.name = name;
 }

public String getName() {
    return name;
}
}