import java.util.Scanner;

public class all {

    public static void main(String[] args) {
        System.out.println("All The java program is here");

        Scanner scanner = new Scanner(System.in); // You can take scanner globally

        // For input
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

        // Even or Odd
        System.out.println("Enter a number to check if it is even or odd:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Equality check
        System.out.println("Enter two numbers to check:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("Equal");
        } else if (number1 > number2) {
            System.out.println("Greater");
        } else {
            System.out.println("Less");
        }

        //Switch......

        System.out.println("write 1, 2, 3 for print hi hello namaste");
        int button = scanner.nextInt();
        switch(button){
            case 1:System.out.println("Hi");
                break;
            case 2:System.out.println("Hello");
                break;
            case 3:System.out.println("Namaste");
                break;
            default:System.out.println("Wrong choice");
        }

        //..........LOOP...........
        // for loop...
        for(int i = 0;i<10;i++){
            System.out.println("Mahakal Bhaskar");
        }
        
        //Print 0 to 10
        System.out.println("To print 0 to 10");
        for (int count =0; count <11; count++){
            System.out.println(count);
        }

        //...While loop
        System.out.println("print 1 to 10");
        int t = 0;
        while(t<11){
            System.out.println(t);
            t++;
        } 

        // do while
        System.out.println("print a to d");
        int a= 0;
        do{
            System.out.println(a);
            a++;
        }while(a<3);

        // Print the sum of first Natural Number
        System.out.println("Natural Number sum");
        int n = scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println(sum+"total sum");

        // tabale of natural number 
        System.out.println("Enter your number for print "+"");
        int mm = scanner.nextInt();
        System.out.println("The table is ====="+"");
        for(int i= 1;i<=10;i++){
           System.out.println(i*mm);
        }

        //Pattern
        System.out.println("Print how many row you want");
        int mmc = scanner.nextInt();
        System.out.println("Print how many column you want");
        int nnc = scanner.nextInt();
    
                for(int i=1;i<=mmc;i++){  //Outer loop //first i=1 executed ,,, then j=1 and print *
                    for(int j=1;j<=nnc;j++){ //Inner loop//Then j increment by 1 ,2,3,4... and print * 5 times
                        System.out.print("*");     //After print 5 star sout() blank (means next line)
                    }                                //is printed)... then i is increment by 1,2,3 and so on
                        System.out.println();        //And make pattern
            }
        
        //..INNER LOOP PRINT DOES NOT CONTAIN LN (beacause of ln means next line)
        
        // Close the scanner at the end
        scanner.close();//it is nessesarry to close in scanner
    }
}
