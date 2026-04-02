package lec37;
import java.util.*;
public class nthRootOptimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean isExist=false;
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            int x=(int)Math.pow(mid,n);
            if(x==m) {
                isExist=true;
                System.out.println(mid);
                break;
            }
            else if(x<m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            
    
        if(isExist==false) System.out.println("not exist");
    }
 }
