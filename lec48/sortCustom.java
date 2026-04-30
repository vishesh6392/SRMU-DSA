package lec48;
import java.util.*;
public class sortCustom{
     public static void main(String[] args) {
        Integer arr[]={30,80,52,55};
        Arrays.sort(arr,(a,b)->{
             String ab = a+""+b;
             String ba = b+""+a;
            return (ab).compareTo(ba);});
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
     }
}
