
package arcanepath;

import java.util.Scanner;


class Range{
   
    public int range(int min, int rangging ){
        return (int) (Math.random()* (rangging)+ min);
    }
}
class game{
    public void game(){
        
        Scanner sc = new Scanner(System.in);
        Range G = new Range();
        int attempt=0;
        int totAttempts=0;
        int win =0;
        
        System.out.println("Enter Maximum value: ");
        int max= sc.nextInt();
        
        System.out.println("Enter minimum value: ");
        int min = sc.nextInt();
        
        int ranging=max-min+1;
        int randomNum=G.range(min, ranging);
        
        while(true){
            System.out.println("Guess any number between "+ min +" and "+ max +" :- ");
            int guess= sc.nextInt();
            attempt++;
            
            if(guess>randomNum){
                System.out.println(guess +" is Greater!!");
            }else if(guess <randomNum){
                System.out.println(guess +" is less !!");
            }else{
                System.out.println("Congratulation "+ guess +" is Equal");
                win++;
                break;
            }
        }
        totAttempts +=attempt;
        System.out.println("------------------------");
        System.out.println("Attempts :- " +attempt);
        System.out.println("Win :- " + win);
        System.out.println("------------------------");
        
        System.out.println("Do you want to play again ???");
        System.out.println("Press 1 to Continue \nPress 2 to Exit ");
        int PAgain= sc.nextInt();
        if (PAgain==1){
            game();
        }
        
    }
}

public class GuessGame {
    
    public static void main(String args[]){
        
        game G = new game();
        G.game();
        
    }
}
