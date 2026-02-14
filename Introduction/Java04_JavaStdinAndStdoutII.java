

import java.util.*;

public class Java04_JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int i = scan.nextInt();
        double d = scan.nextDouble();
        //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");   
        scan.nextLine();       
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
