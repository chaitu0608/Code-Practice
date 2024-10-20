import java.util.*;

class Number_Generator{
    int input;
    int target;
    int noOfGuesses;

    public Number_Generator(){
        this.target = (int)(Math.random()* (5-0)+0);
        this.noOfGuesses = 0;
    }//default constructor

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        input = sc.nextInt();
    }

    public boolean isCorrectNumber(){
        if(this.target == this.input){
            System.out.println("You guessed it!");
            return true;
        }
        else if(this.target > this.input){
            System.out.println("Higher!");
            SetnoOfGuesses(GetnoOfGuesses()+1);//no of guesses ++
        }
        else{
            System.out.println("Lower!");
            SetnoOfGuesses(GetnoOfGuesses()+1);//no of guesses ++
        }
        return false;
    }

    public int GetnoOfGuesses(){
        return noOfGuesses;
    }

    public void SetnoOfGuesses(int guesses){
        this.noOfGuesses = guesses;
    }
}//end of number generator


public class GuesserGame{
    public static void main(String[] args) {
        Number_Generator obj = new Number_Generator();//constructor written above will generate the number and set guess=0
        System.out.println("A random number was generated (5-0), try to guess it!");
        obj.takeUserInput();
        while(!obj.isCorrectNumber()){
            System.out.println("Lets try again...");
            obj.takeUserInput();
        }//end of while loop
        System.out.println("Number of guesses: " + obj.GetnoOfGuesses());
    }//end of main
}//end of main class
