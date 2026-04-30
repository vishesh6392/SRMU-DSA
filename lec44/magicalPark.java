package lec44;
import java.util.*;

public class magicalPark {
      public static int fun(char [][] matrix,int n,int m,int s){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(matrix[i][j]=='.'){
                     s=s-2;
                     if(j!=m-1){
                         s=s-1;
                     }
                 }
                 else if(matrix[i][j]=='*'){
                     s=s+5;
                     if(j!=m-1){
                         s=s-1;
                     }
                 }
                 else{
                     break;
                 }
            }
        }
        return s;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char [][] matrix= new char[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              matrix[i][j]=sc.next().charAt(0);
          }
        }
        int ans= fun(matrix,n,m,s);
        if(ans>=k){
            System.out.println("Yes");
            System.out.println(ans);
        }
        else{
             System.out.println("No");
        }
    }
}


