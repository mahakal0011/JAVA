import java.util.*;
public class function{
    
        public static void myName(String name){
            System.out.println(name);
            return;
        }
        
        //sum of two number
        public static int sumTwo(int a, int b ){
            int sum = a+b;
            System.out.println(sum);
            return 1;
        }

        // calculator
        public static int calCulator(int  k,int l){
            int multiple = k*l;
            System.out.println(multiple);
            return 1;

        }

        //factorial 
        public static int factOrial(int f){
            int fac=1;
            for(int i=1;i<f;i++){
                 fac=i*f;
            }
            System.out.println(fac);
            return 1;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //For print name 
        System.out.println("Enter your name");
        String name= sc.next();
        myName(name);

        // for calculate sum of two number
        System.out.println("Enter your first number ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        sumTwo(a, b);

        //multiple
        System.out.println("Enter your number to multiple");
        int k= sc.nextInt();
        int l= sc.nextInt();
        calCulator(k, l) ;
        
        //factorial
        System.out.println("Enter a number to print factorial");
        int f= sc.nextInt();
        factOrial(f);
    }
}