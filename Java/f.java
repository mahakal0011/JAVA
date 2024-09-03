import java.util.*;
public class f{
    public static void main(String[] args) {
        System.out.println("Hi I am Bhaskar Barman ");

        Scanner sc = new Scanner(System.in);

        //Sum of Natural Number 
        System.out.println("Enter a number to print ");
        int k = sc.nextInt();
        int n=0;
        for(int i=1;i<=k;i++){
            n=n + i;
            System.out.println(n);
            
        }

        // print table 
        System.out.println("Print table enter your number");

        int jk = sc.nextInt();
         System.out.println("The table is-------");
        for(int i=1;i<11;i++){
            System.out.println(i*jk);
        }

        // difference between two number
        System.out.println("Enter a number to check");
        int kk = sc.nextInt();
        System.out.println("Enter secoend nuber to print ");
        int kl = sc.nextInt();
        if(kk>kl){
            System.out.println("first number is greater than 2nd");
            
        }
        else if(kl<kk){
            System.out.println("2nd number is greater than 1st");

        }
        else{
            System.out.println("equal");
        }

        sc.close();
    }
}