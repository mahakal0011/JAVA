import java.util.*;
public class string{
    public static void main(String[] args) {
        // String is decleared by---
        String gh = "My name is mahakal Bhaskar";
        System.out.println(gh);

        // user input an string
       try( Scanner name = new Scanner(System.in)){
        System.out.println("Enter your name to print");

        String Name = name.nextLine();

        System.out.println("The name is "+Name);

        // Concertanation 

        String Name0= "Mahakal ";
        String Name1= "Bhaskar";

        String Name3= Name0+""+Name1;
        System.out.println("The name is "+Name3);

        // To print length of any stiring we use { (variable).length } key
        System.out.println("The Length of string is "+Name3.length());

        // {charAt() key}print name in seperate separate charecter
        for(int i=0;i<Name3.length();i++){
            System.out.println(Name3.charAt(i));
        }

        // { variable1.compareTo(variable2) } that keyword are use to compare two string

        if(Name0.compareTo(Name1)==0){
            System.out.println("The stimg is equal");
        }
        else {
            System.out.println("The sring is not equal");
        }
        System.out.println();

        // Here we can use if(Name0==Name1) , thats work .but 
        if(new String("Mahakal")== new String("Bhaskar")){
            System.out.println("The stimg is equal");
        }
        else {
            System.out.println("The sring is not equal");
        }   // Here == in if function is does not work ... so we can mustly use {variable.compareTo.variale2} function
        
        
    }
    }
}
}