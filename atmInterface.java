
package arcanepath;

import java.util.Scanner;

class account{
     int pin=2831;
     int balance =50000;
     int transaction=0;
     String transationHist=" ";

    Scanner sc = new Scanner(System.in);
    
    // check pin
    public void Pin(){
        System.out.println("Enter Pin");
        int pinnum= sc.nextInt();
        
            if(pinnum==pin){
            System.out.println("*************************************************");
             mainmenu();
        }else{
            System.out.println("Please enter valid pin");
            Pin();
        } 
    }        
            
    // for deposite cash
    public void deposite() {
        
        System.out.println("----------------------------------------");    
        System.out.println("Enter amount to deposite");
        int amt_d=sc.nextInt();
      
        if(amt_d>10000){
            System.out.println("Amount should be less than 100000");
        }else{
            System.out.println("Rs."+amt_d +" is deposited successfully");
        }
       balance+=amt_d;
       System.out.println("Available balance is = "+balance);
       transaction++;
       String str="Rs."+amt_d+" Deposited\n";
       transationHist=transationHist.concat(str);
    }
    
    // for withdrawal
    public void withdraw(){
        
        System.out.println("---------------------------------------");
        System.out.println("For Withdrawal ");
        System.out.println("Enter Amount ");
        int amt_w= sc.nextInt();
        if(amt_w<balance){
            System.out.println(amt_w+" is withdrawed successfully");
            balance-=amt_w;  
            System.out.println("Available Balance is " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
        transaction++;
        String str="Rs."+amt_w+" withdrawed\n";
        transationHist=transationHist.concat(str);
 
    }
    
    // transaction history 
    public void transactionHistory(){
        System.out.println("-------------------------------------");
        if (transaction==0){
            System.out.println("Empty");
        }else{
            System.out.println("Transaction history is :-\n"+transationHist);
        }
    }
    
    // Transfer 
    public void transfer(){ 
        System.out.println("-------------------------------------");
        System.out.println("enter accoount num:- ");
        int acc=sc.nextInt();
        System.out.println("enter amount to transfer :-");
        int amt_trn=sc.nextInt();
        if(amt_trn<=balance){
            System.out.println(amt_trn + "is transferred to " + acc);
            System.out.println("Thank You");
        }else{
            System.out.println("Insufficient Balance"); 
        }
        transaction++;
        String str="Rs."+amt_trn+" Transferred\n";
        transationHist=transationHist.concat(str);
    }
      
            
    public void mainmenu(){
        System.out.println("Please enter your choice from below");
        System.out.println("1) Deposite\n2) Withdrawal\n3) Transaction History\n4) Transfer\n5) Quit ");
        int choice= sc.nextInt();
        
        switch(choice){
            
            case 1:
                deposite();
                break;
               
            case 2:
                withdraw();
                break;
                
            case 3:
                transactionHistory();
                break;
                
            case 4:  
                transfer();
                break;
            
            case 5:
                return;
                
            default:
                System.out.println("Please Enter valid choice");
                System.out.println("**********************");
                mainmenu();
        }       
        System.out.println("--------------------------------------------------");
        System.out.println("1) Main menu\n2) Exit");
        int lastchoice= sc.nextInt();
        if(lastchoice==1){
            System.out.println("*************************************");
            mainmenu();
        }else{
            System.out.println("THANK YOU FOR USING SBI ATM");
        }      
    }
}

public class atmInterface {
   
    public static void main(String args[]){
        
         account a = new account();
        
        System.out.println("------welcome to SBI ATM---------");
        System.out.println("Please Insert your Card");
        
        a.Pin();
    
    }
   
}
