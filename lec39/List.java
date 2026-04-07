package lec39;
import java.util.*;
public class List {

    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         System.out.println(list.size());
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
         }
         System.out.println();
         list.remove(list.size()-1);
         System.out.println(list.size());
         System.out.println(list.isEmpty());
         list.removeAll(list);
         System.out.println(list.isEmpty());   

    }
}
