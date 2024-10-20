import java.util.Scanner;


class NumberException extends Exception{
    public NumberException(){}
    @Override
    public String toString(){
        return "You chose the wrong number son";
    }
}




public class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number: ");

        try
        {
            int number = sc.nextInt();
            if (number.contains(3))
            {
                System.out.println("You entered a valid number having digit 3 " + number);
            }
            else
            {
                throw new NumberException();
            }
        }
        catch (NumberException e)
        {
            System.out.println(e);   
            System.out.println("Number Exception Encountered");     
        }
           
        finally
        {
            sc.close();
        }
    }
}





