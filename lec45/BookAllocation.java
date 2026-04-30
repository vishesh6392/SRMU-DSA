package lec45;
import java.util.*;

public class BookAllocation {
        public static boolean canPossible(int[] books,int page,int student){
        int pages=0;
        int st=1;
        for(int i=0;i<books.length;i++){
            if(books[i] > page) return false; 
            if(pages+books[i]<=page){
                pages+=books[i];

            }
            else{
                st++;
                pages=books[i];
            }
        }
        return st<=student;
    }
    public static int maxPages(int [] books, int student){
         int mx=books[0];
         for(int i=1;i<books.length;i++){
              mx+=books[i];
         }
         int ans=0;
         for(int page=1;page<=mx;page++){
             if(canPossible(books,page,student)){
                 return page;
             }
         }
         return -1;
    }
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int t= sc.nextInt();
      while(t-->0){
          int n=sc.nextInt();
          int students=sc.nextInt();
          int [] books=new int[n];
          for(int i=0;i<n;i++){
              books[i]=sc.nextInt();
          }
          int ans=maxPages(books,students);
          System.out.println(ans);
      }
    }

}

