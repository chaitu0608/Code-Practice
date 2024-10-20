import java.util.*;
public class array_sort {
    public static void main(String[] args) {
        int[] array = {5,2,8,7,10,1};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }//end of if
            }//end of j
        }//end of i
        System.out.println(Arrays.toString(array));
    }//end of main
}//end of class
