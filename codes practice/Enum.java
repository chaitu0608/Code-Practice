ximport java.util.*;
import java.util.Vector;
import java.util.Enumeration;


class Shopping_listt{
    private String name;
    private int price;
    private int quantity;


    Shopping_listt(String name, int price, int quantity){
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getname(){
        return name;
    }


    public int getprice(){
        return price;
    }


    public int getquantity(){
        return quantity;
    }


    public String toString(){
        return "Item name: " + name + "\n" + "Item Price: " + price + "\n" + "Item Quantity: " + quantity + "\n";
    }
}


class shopping_listt_manager{
    private Vector <Shopping_listt> listt;
    private Scanner sc;


    public shopping_listt_manager(){
        listt = new Vector<>();
        sc = new Scanner(System.in);
    }


    public void add_item(){
        System.out.print("Enter item name: ");
        String n = sc.nextLine();


        System.out.print("Enter item price: ");
        int p = sc.nextInt();


        System.out.print("Enter item quantity: ");
        int q = sc.nextInt();
        sc.nextLine();


        Shopping_listt li = new Shopping_listt(n,p,q);
        listt.add(li);
    }


    public void add_specific_pos(){
        System.out.print("Enter item name: ");
        String npos = new String();
        npos = sc.nextLine();


        System.out.print("Enter item price: ");
        int ppos = sc.nextInt();


        System.out.print("Enter item quantity: ");
        int qpos = sc.nextInt();
        sc.nextLine();
       
        System.out.print("Enter the item name before which you want to add your new item: ");
        String n_after = sc.nextLine();


        int index = listt.indexOf(n_after);


        Shopping_listt pos = new Shopping_listt(npos, ppos, qpos);


        listt.add(index + 1, pos);
    }


    public void delete_item(){
        System.out.print("Enter item name: ");
        String itemdel = sc.nextLine();


        int i;
        for(i=0; i<listt.size(); i++){
            if(listt.get(i).getname().equals(itemdel)){
                listt.remove(i);
            }
        }
        System.out.println(itemdel + "Deleted from the listt");
    }


    public void display(){
        Enumeration<Shopping_listt> en = listt.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}




public class Enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shopping_listt_manager SL = new shopping_listt_manager();
        int ch;
        int b=1;
       
        System.out.println("Following are the operations to conduct on your Shopping listt: ");
        System.out.println("1. Add item\n2. Add item at specific position\n3. Delete item\n4. Display items\n5. Exit");
        while(b==1){
            System.out.print("Enter your operation: ");
            ch = sc.nextInt();


            switch(ch){
                case 1:
                SL.add_item();
                break;


                case 2:
                SL.add_specific_pos();
                break;


                case 3:
                SL.delete_item();
                break;
               
                case 4:
                SL.display();
                break;


                case 5:
                b=0;
                System.out.println("Exiting...");
                break;


                default:
                System.out.println("Invalid Input");
                break;
            }
        }
        sc.close();
    }
   
}


