package function;


public class swap {

     public void swap(int a,int b) {
         System.out.println(a+"before inside");
         System.out.println(b+"before inside");

         int temp=a;
         a=b;
         b=temp;
         System.out.println(a+"after inside");
         System.out.println(b+"after inside");
    }
    
    public static void main(String[] args) {
        int a=40;
        int b=60;
        swap ob1= new swap();
         ob1.swap(a,b);
    
        System.out.println(a);
        System.out.println(b);
    }
}
