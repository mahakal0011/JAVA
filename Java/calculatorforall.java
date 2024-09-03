import java.util.*;
public class calculatorforall {
    public static void main(String[] args) {
        System.out.println("Hi here the basic calculator");

        Scanner Num = new Scanner(System.in);
        System.out.println("How many number you want to calculate");
        double k = Num.nextDouble();
        double l = Num.nextDouble();

        System.out.println("Enter 1 for Sum , 2 for Sub , 3 for multiply; 4 for divid , 5 for %");
        int j = Num.nextInt();

        switch (j) {
            case 1:
                double sum = k+l;
                System.out.println(sum);
                break;
            case 2:
                double sub  = k-l;
                System.out.println(sub);
                break;
            case 3: 
                double mul = k*l;
                System.out.println("mul");
                break;
            case 3:
                double div = k
                
        
            default:
                break;
        }
    }
    
}
