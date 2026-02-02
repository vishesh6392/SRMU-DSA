public class pat {
    public static void main(String[] args) {
        int i=0;
        
        while(i<4){
            int j=0;
            while(j<=i){
                System.out.print("*");   
                j++;
            }
            System.out.println();
           
            i++;
        }
         i=0;
        
        while(i<5){
            int j=0;
            while(j<5-i){
                System.out.print( "*");   
                j++;
            }
           
            System.out.println();
           
            i++;
        }
    }
}
