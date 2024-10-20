class Base{
    int x;

    public void setX(int val){
        System.out.println("In base, setting value of X");
        this.x = val;
    }

    public int getX(){
        return x;
    }
}//end of Base

class Derived extends Base{
    int y;

    public void setY(int val){
        System.out.println("In derived, setting y");
        this.y = val;
        this.x = val + 10;
    }

    public int getY(){
        return this.y;
    }

    public int gettingX(){
        return this.x;
    }

    //System.out.println(this.x);
}//end of derived
public class inheri{
    public static void main(String[] args){
        Base obj = new Base();
        obj.setX(19);
        System.out.println(obj.getX());

        Derived obj2 = new Derived();
        obj2.setY(25);
        System.out.println(obj2.getY());
        System.out.println(obj2.gettingX());
        System.out.println(obj.getX());

    }//end of main
}//end of main class
