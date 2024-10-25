package Task;

import java.util.Scanner;

public class Task005_function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first value ");
        int a= sc.nextInt();

        System.out.println("enter the second value");
        int b= sc.nextInt();

        System.out.println("sum of number is "+ sum_of_number(a,b));
        System.out.println("sub of number is "+ sub_of_number(a,b));
        System.out.println("mul of number is "+ mul_of_number(a,b));
        System.out.println("div of number is "+ div_of_number(a,b));
        System.out.println("rem of number is "+ rem_of_number(a,b));

    }

    static int sum_of_number(int a,int b){
        return a+b;
    }

    static int sub_of_number(int a, int b){
        return a-b;
    }
    static int mul_of_number(int a, int b){
        return a*b;
    }

    static int div_of_number(int a, int b){
        return a/b;
    }
    static int rem_of_number(int a, int b){
        return a%b;
    }

}
