package lec44;
import java.util.*;

public class ColWithMaxSum {
     public static void main (String args[]) {
     Scanner sc= new Scanner(System.in);
     int  n=sc.nextInt();
     int [][] matrix=new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             matrix[i][j]=sc.nextInt();
         }
     }
     int maxSum=0;
     int col=-1;
     for(int j=0;j<n;j++ ){
         int colsum=0;
         for(int i=0;i<n;i++){
             colsum+=matrix[i][j];
         }
         if(colsum>maxSum){
             maxSum=colsum;
             col=j;
         }
     }
     col=col+1;
     System.out.println(col+" "+maxSum);
    }
}

