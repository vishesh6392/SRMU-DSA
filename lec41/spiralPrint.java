package lec41;

public class spiralPrint {
    public static void spiral(int [][] grid){
        int top=0;
        int left=0;
        int bottom=grid.length-1;
        int right= grid[0].length-1;
       while(left <= right && top <= bottom){

            // top row
            for(int i = left; i <= right; i++){
                System.out.print(grid[top][i] + " ");
            }
            top++;
            System.out.println();
            // right column
            if(top <= bottom){
                for(int i = top; i <= bottom; i++){
                    System.out.print(grid[i][right] + " ");
                }
                right--;
                System.out.println();
            }

            // bottom row
            if(left <= right && top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(grid[bottom][i] + " ");
                }
                bottom--;
                System.out.println();
            }

            // left column
            if(left <= right && top <= bottom){
                for(int i = bottom; i >= top; i--){
                    System.out.print(grid[i][left] + " ");
                }
                left++;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int [][] grid={{1,2,3,4,5,6,7,8,9,10},
                     {11,12,13,14,15,16,17,18,19,20},
                     {21,22,23,24,25,26,27,28,29,30},
                     {31,32,33,34,35,36,37,38,39,40},
                     {41,42,43,44,45,46,47,48,49,50},
                     {51,52,53,54,55,56,57,58,59,60},
                     {61,62,63,64,65,66,67,68,69,70}
                   };
                   spiral(grid);
    }
}
