public class Main{
    public static void  main(String[] arg){
        System.out.println("Heloo world ");// To print... Here short form is== type shot and press tab boutton // 
       
        byte ni =12;
        int age= 1234567899;// this is the the type of data

        String name = "Bhaskar";
        System.out.println(name.length());// How to print string length 

        String name1 = "Bhaskar ";
        String name2 = "gudu";
        String name3 = name1 + name2;//to make 3rd string with help of two string
        System.out.println(name3);// that's way print data types
        System.out.println(name3.charAt(0));
        // Replace
        String nam = "Bhaskar Barman ";
        String name12=nam.replace('a','m');
        System.out.println(name12);
        //Substring
        System.out.println(nam.substring(1, 5));
        //arrays
        int[] marks = new int[12];
        marks[0]= 100;
        marks[1]=65;
        marks[2]=69;
        System.out.println(marks[1]);

        //Conditional Statemen....... like if , else...else if...switch ...break....//
        

    }

}