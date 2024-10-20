import java.util.*;
class ArrayOfObjects{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts you want to store");
        int n = sc.nextInt();
        User[] obj = new User[n];
        int choice,ch,count=0;
        int id,i;
        String name;
        float acc_bal;
        int src_id;
        do{
            System.out.println("Enter 1 to add a record\nEnter 2 to delete a record\nEnter 3 to display records");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the customer/'s ID");
                        id = sc.nextInt();
                        System.out.println("Enter the customer/'s name");
                        sc.nextLine();
                        name = sc.nextLine();
                        System.out.println("Enter the customer/'s balance");
                        acc_bal = sc.nextFloat();
                        obj[count] = new User(id,name,acc_bal);
                        count++;
                        break;
                case 2: //delete_record();
                        System.out.println("Enter The ID of the customer who's details you want to delete");
                        src_id=sc.nextInt();
                    for ( i = 0; i <= count; i++) {
                        if(obj[i].id==src_id){
                            System.out.println("Found the customer, now deleting");
                            for (int j = i; j < count-1; j++) {
                                //obj[j+1] = obj[j];
                                obj[j].id = obj[j+1].id;
                                obj[j].Name = obj[j+1].Name;
                                obj[j].Balance = obj[j+1].Balance;
                            }//moved the elements ahead, behind by 1 index
                            count=count-1;
                            break;
                        }
                        else if(i == count){
                            System.out.println("Customer not found!");
                        }
                    }
                        break;
                case 3: System.out.println("Printing the Array");
                        for( i=0;i<count;i++){
                            System.out.println(STR."ID: \{obj[i].id}   Name: \{obj[i].Name}    Balance: \{obj[i].Balance}");
                        }
                        break;
                default: System.out.println("Invalid Input, try again");
                         break;
            }//end of switch case
            System.out.println("Enter 1 to continue, 0 to exit");
            ch = sc.nextInt();
        }while(ch>0);
    }//end of main
}//end of class

class User{
    int id;
    String Name;
    float Balance;
    //creating the constructor for User
    User(int ID,String name,float acc_bal){
        this.id = ID;
        this.Name = name;
        this.Balance = acc_bal;
    }//end of constructor
}//end of User