public class BoxingUnboxing{
    public static void main(String[] args){
        Integer iOb = Integer.valueOf(100);
        System.out.println(iOb);
        System.out.println("Type: " + iOb.getClass().getName());

        int i = iOb.intValue();
        System.out.println(i);
        System.out.println();
    }
}
