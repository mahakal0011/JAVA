public class check {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){               //first i=1 executed ,,, then j=1 and print *
            for(int j=1;j<9;j++){            //Then j increment by 1 ,2,3,4... and print * 5 times
                System.out.print("*");     //After print 5 star sout() blank (means next line)
            }                                //is printed)... then i is increment by 1,2,3 and so on
                System.out.println();        //And make pattern
    }
    System.out.println("hhh");
    int k = 4;
    int j = 6;
    for(int i = 1; i<=k ; i++){
        for(int m=1  ;m<=j; m++){
            if(i==1 || m==1 || i==k || m==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    System.out.println("prtint ");
    int n=4;
    
    for(int ik = 1; ik<=n ; ik++){
        for(int h =1 ;h<=ik ; h++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("hi");
    int thar = 4;
    for(int i=thar ;i>=1 ; i-- ){
        for(int jh=1;jh<=i;jh++){
            System.out.print("*");
        }
        System.out.println();
    } 
    System.out.println("inverted piramit");
    int nn= 4;
    for(int i=1; i<=nn; i++){
        // for print space
        for(int g=1;g<=nn - i;g++){
            System.out.print(" ");
        }
        for(int g=1;g<=i;g++){
            System.out.print("*");
        }
    }
}
}
