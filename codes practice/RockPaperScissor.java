import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();//using the Random class and it's built in functions

        int computerinput = rand.nextInt(3);//generates integer between 0 to 2
        System.out.println("Enter 0 for Rock \nEnter 1 for Paper \nEnter 2 for Scissors");
        int userinput = sc.nextInt();

        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput > computerinput || (userinput == 0 && computerinput == 2)){
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer wins!");
        }
        System.out.println("Your input: " + userinput);
        System.out.println("Computer input " + computerinput);
    }//end of main
}//end of main class

//for a range, use:  random_number = rand.nextInt(max-min+1)+min;

//for math class random(), use: int random_number = (int)(Math.random()* (max - min) + 1);