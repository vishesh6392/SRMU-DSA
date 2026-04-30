package lec44;
import java.util.*;

public class PrintUpperRightTrangularMat {
     public static void changeInTriangular(int[][] grid,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                grid[i][j]=0;
            }
        }
    }
    public static void main (String args[]) {
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int [][] grid=new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             grid[i][j]=sc.nextInt();
         }
     }
     changeInTriangular(grid,n);

      for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}

