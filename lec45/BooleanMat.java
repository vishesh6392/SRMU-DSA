package lec45;
import java.util.*;

public class BooleanMat {
      public static int[][] fun(int[][] matrix, int m, int n){
        int [] row= new int[m];
        int [] col= new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(col[j]==1 || row[i]==1){
                    matrix[i][j]=1;
                }
            }
        }
        return matrix;
    }
    public static void main (String args[]) {
     Scanner sc  = new  Scanner(System.in);
     int  m=sc.nextInt();
     int n=sc.nextInt();
     int [][] matrix= new int[m][n];

     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             matrix[i][j]=sc.nextInt();
         }
     }
     int [][] mat=fun(matrix,m,n);
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             System.out.print(mat[i][j]+" ");
         }
         System.out.println();
     }

    }
}


