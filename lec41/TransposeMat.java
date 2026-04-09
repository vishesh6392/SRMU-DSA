package lec41;

import java.util.Scanner;

public class TransposeMat {
    public static int [][] transpose(int[][]  mat){
          int row=mat.length;
          int col=mat[0].length;
          int [][] trans= new int[col][row];
          for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=mat[i][j];
            }
          }
          return trans;

    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int row= sc.nextInt();
         int col=sc.nextInt();

         int [][] mat= new int[row][col];
        //  input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int [][] ans=transpose(mat);

        // output
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
