import java.util.*;

public class Java03_JavaIfElse {



   static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
         sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n%2 == 0){
            if( (n>1 && n<6) || (n>20)){
                System.out.println("Not Weird");
            }
            else if(n>5 && n<21 ){
                System.out.println("Weird");
            }
               
        }
        else{
            System.out.println("Weird");
        }
        
        sc.close();
    }
}
