import java.util.*;
public class array{
    public static void main(String[] args) {
        int[] marks = new int[3]; // To define an arry ===== type[] variable name = new(for allocate memory) type(int,float..)[size]
        //other type of decleration ==== int marks[] = new int[].....
        marks[0]=12;
        marks[1]= 14;
        marks[2]= 16;
        // Another type of array decleration is ---int marks[]= {12,14,16}
        
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        //User input 
       try(Scanner mahakal = new Scanner(System.in)){
        System.out.println("Enter how many number you want to add");
        int k = mahakal.nextInt(); // for input size of an array

        int number[] = new int[k]; // Derclearing array
        

        // for input
        System.out.println("Enter the number you want to store"); 
        for(int i=0; i<k ;i++){
            number[i]= mahakal.nextInt();
        }


        // To find a Number 
        System.out.println("Enter which number you want to find ");
        int j = mahakal.nextInt();

        for(int i=0 ; i<k ; i++){
            if(number[i]== j){
                System.out.println("Number is found in index"+i+" "+"Number is founded");
            }
           
        }

        // For output
        System.out.println("Print ===");
        for(int i=0; i<k ; i++){
            System.out.println(number[i]);
        }
    }

    
}
}