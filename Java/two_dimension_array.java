import java.util.*;

public class two_dimension_array {
    public static void main(String[] args) {
        // type[][] arrayName = new type[rows][column]
        Scanner bhaskar = new Scanner(System.in);

        System.out.println("How many rows and column you want to add");
        int row = bhaskar.nextInt();
        int colum= bhaskar.nextInt();
        int mahakal[][] = new int[row][4];

        // user input
        
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    mahakal[i][j] = bhaskar.nextInt();
                }
            }

            //for search an elment
            System.out.println("Enter number to find");
            int hh= bhaskar.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<colum;j++){
                
                    if(mahakal[i][j]== hh){
                    System.out.println("the number is found in index "+i+ ","+j);
                    }
                }
                
            }


            // for output
            System.out.println("The elements of the array are:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.print(mahakal[i][j] + " "); // Print elements in the same line
                }
                System.out.println(); // Move to the next line after printing each row
            }
       bhaskar.close(); 
    }
}
