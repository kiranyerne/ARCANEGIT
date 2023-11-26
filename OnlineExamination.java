
package arcanepath;

import java.util.Scanner;

class functionality{
    
    public static final int TIME_LIMIT = 5000; // 5 seconds in milliseconds

    Scanner sc = new Scanner(System.in);
   
    
    public void logout(){
        System.out.println("Loging Out....");
        return;
    }
    
   public void quiz(){
        int Score=0;
        int TotalScore=0;
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Answer the questions within 5 sec or the answer will be considered as wrong!!");
        System.out.println("-------------------------------------------------------------------------------");
        
        String[] questions = {
            "A. Which of the following is NOT a Java features??",
            "B. Which of the following is NOT an OOPS concept in Java?",
            "C. When an array is passses to a method,what does the method receive??",
            "D. What is the size of Float and Double in Java?",
            "E. Which statement is true about Java?"
        };
        
        String[][] choices = {
                {" 1) Dynamic", " 2) Architecture Neutral"," 3) Use of pointers", " 4) Object-oriented"},
                {" 1) Polymorphism"," 2) Inheritance "," 3) Compilation"," 4) Encapsulation"},
                {" 1) The reference of the array", " 2) A copy of the array ", " 3) Length of the array", " 4) Copy of first element"},
                {" 1) 32 and 64 "," 2) 32 and 32 "," 3) 64 and 64"," 4) 64 and 32\""},
                {" 1) Java is a sequence-dependent programming language"," 2) Java is a code dependent programming language",
                    " 3) Java is a platform-dependent programming language"," 4) Java is a platform-Independent programming language"}
        };

        String[] answers = {
            "3",
            "3",
            "1",
            "1",
            "4"
        };
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String choice : choices[i]) {
                System.out.println(choice);
            }
            System.out.print("Your answer:  ");

            // Get the start time for the timer
            long startTime = System.currentTimeMillis();

            String userAnswer = sc.next();

            long Time_elapsed= System.currentTimeMillis() - startTime;

            // Check if the user answered within the time limit
            if (Time_elapsed <= TIME_LIMIT) {
                Score++;
                // Check if the user's answer is correct
                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    System.out.println("Correct!\n");
                } else {
                    System.out.println("Incorrect. The correct answer is: " + answers[i] + "\n");
                }
            } else {
                System.out.println("Time's up! Moving on to the next question.\n");
            }
        }

        System.out.println("Quiz completed!");
        
        // Showing total score of the test 
        TotalScore+=Score;
        System.out.println("------------------------------");        
        System.out.println("Total Score = "+TotalScore);
        System.out.println("------------------------------");
        
        System.out.println("Press 1 to give Retest\nPress 2 to go to Main menu ");
        int again=sc.nextInt();
        if(again==1){
            quiz();
        }else{
            mainMenu();
        }
   }
    
    public void updateProfile() {
        
        System.out.println("------------------------------");
        System.out.println("Press 1 to change User Name \nPress 2 to change Password \nPress 3 to change both User name & Password ");
        int opt = sc.nextInt();
        
        if(opt==1){
            
            System.out.println("Enter new user name :");
            String newName= sc.next();
            System.out.println("Your User name is successfully changed!!");
            
        } else if (opt==2){
            System.out.println("Enter new password :");
            int newPass= sc.nextInt();
            System.out.println("Your Password is successfully  changed!!");
           
        }else{
            
            System.out.println("Enter new user name :");
            String newName= sc.next();

            System.out.println("Enter new password :");
            int newPass= sc.nextInt();
            System.out.println("Your User name & Password is successfully  changed!!");
                 
        }
        System.out.println("1. Main menu ");
        System.out.println("2. Exit");
        int mm= sc.nextInt();
        if(mm==1){
            mainMenu();
        }else{
            System.out.println("Exit......");
        }
        
    }
   
    
    public void login(){
        String userName="Kiran";
        String  pass="1234";
       
        System.out.println("Enter User Name : ");
        String user_ip=sc.next();
        System.out.println("Enter User Password : ");
        String user_pass = sc.next();

         
        if( user_ip.equalsIgnoreCase(userName) && user_pass.equalsIgnoreCase(pass)){
            System.out.println("Login Successfully ....\nWelcome "+user_ip+"!!!");
            
        }else{
            System.out.println(" Please enter correct User Name or Password");
            login();
        }
    }

    
    public void mainMenu(){
        
        System.out.println("------------------------------");
        System.out.println("1. Update Profile \n2. Start Exam \n3. Logout");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                updateProfile();
                break;
            case 2:
                quiz();
                break;
            case 3:
              logout();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mainMenu();
            }
    }
}

public class OnlineExamination {
    
    public static void main(String args[]){
        
        System.out.println("------WELCOME TO ONLINE EXAMINATION PORTAL.-------- ");
        functionality f  = new functionality();
        f.login();
        f.mainMenu();
    }
    
}
