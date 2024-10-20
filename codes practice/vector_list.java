import java.util.*;
class Employee{
    private int ID;
    private String Name;
    private float Salary;

    public String getName(){
        return this.Name;
    }
    public int getID(){
        return this.ID;
    }
    public float getSalary(){
        return this.Salary;
    }
    public void setID(int id){
        this.ID = id;
    }
    public void setSalary(float sal){
        if(sal > 0){
            this.Salary = sal;
        }
        else{
            System.out.println("Enter a postive value for salary");
        }
    }
    public void setName(String name){
        this.Name = name;
    }

    //function to sort the vector
//    static void SortVector(){
//        for(int i=0;i<V1.size();i++){
//            for(int j=0;j;)
//        }
//    }
}//end of employee
public class vector_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> V1 = new Vector<Employee>();
        int choice,ch,count=0;
        do{
            System.out.println("Enter 1 to add an Employee\nEnter 2 to insert at an index \nEnter 3 to delete by name \nEnter 4 to delete by ID \nEnter 5 to print all the records");
            choice = sc.nextInt();
            switch(choice){
                case 1: //creating an employee record
                        System.out.println("Enter the name");
                        String E_name = sc.nextLine();
                        sc.next();//consume new line
                        V1.get(count).setName(E_name);

                        System.out.println("Enter the ID");
                        int E_id = sc.nextInt();
                        V1.get(count).setID(E_id);

                        System.out.println("Enter the Salary");
                        float E_salary = sc.nextInt();
                        V1.get(count).setSalary(E_salary);

                        count++;
                case 2: //add an Employee at an index
                        //display_employees();//printing the entire vector
                        System.out.println("Enter the index at which you want to add a record");
                        int index = sc.nextInt();

                        for(int i=0;i < V1.size();i++){
                            if(i==index){
                                for(int j=V1.size();j >= i;j--){
                                    //V1.get(j) = V1.get(j-1);
                                }//moved every element ahead of i by 1

                                System.out.println("Enter the name");
                                String new_name = sc.nextLine();
                                sc.next();//consume new line

                                System.out.println("Enter the ID");
                                int new_id = sc.nextInt();

                                System.out.println("Enter the Salary");
                                float new_salary = sc.nextInt();

                                V1.get(i).setID(new_id);
                                V1.get(i).setName(new_name);
                                V1.get(i).setSalary(new_salary);

                            }//index found
                        }//end of for
            }//end of switch case
            System.out.println("Enter 1 to continue, 0 to exit");
            ch = sc.nextInt();
        }while(ch>0);
    }//end of main function
}//end of vector list
