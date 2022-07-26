import java.util.Scanner;

import static java.lang.System.in;

public class lesson1 {

    public static long factorial(long raqam){
        if (raqam<=1){
            return  1;
        }else {
            return raqam*factorial(raqam-1);
        }
    }



    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        System.out.print("= ");
        long a= scanner.nextInt();
        System.out.println(factorial(a));

//        System.out.println(factorial(3));


//        startWith
//        endsWith
//        replace
//                trim
//                index of
//                        touppercase to lowercase
//                concat

















    }
}
