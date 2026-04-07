package lec39;

public class twoDArray {
    
    public static void main(String[] args){
        int[][] grid1 = new int[3][4];
        int[][] grid2= {
                  {1, 2, 3},
                   {4, 5, 6}
                             };

            int[][] arr = new int[2][3];
            boolean[][] b = new boolean[2][2];
            double[][] d = new double[2][3];

                
                for (int i = 0; i < 2; i++) {
                  for (int j = 0; j < 3; j++) {
                      arr[i][j] = i + j;
                      }
                  }
            //   print

              for (int i = 0; i < 2; i++) {
                  for (int j = 0; j < 3; j++) {
                      System.out.print(arr[i][j]+" ");
                      }
                      System.out.println();
                  }

                             
    }
    
}