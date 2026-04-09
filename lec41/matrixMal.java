package lec41;

import java.util.Scanner;

public class matrixMal {
    public static void multiplication(int[][] mat1,int[][] mat2){
        int r1=mat1.length;
        int c1=mat1[0].length;
        int r2=mat2.length;
        int c2=mat2[0].length;

        if(c1!=r2){
            System.out.println("Invalid:");
        }
        else{
            int [][] prod=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){

                    for(int k=0;k<r2;k++){
                        prod[i][j]=prod[i][j]+mat1[i][k]*mat2[k][j];
                    }
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println();
            }


        }
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int r1 = sc.nextInt();
         int c1=sc.nextInt();
         int r2=sc.nextInt();
         int c2=sc.nextInt();
         int [][] mat1= new int[r1][c1];
         int [][] mat2= new int[r2][c2];

         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
         }

          for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
         }

         multiplication(mat1, mat2);
    }
}
