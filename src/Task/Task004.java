package Task;

import javax.swing.*;
import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value of a");
        int a= scanner.nextInt();

        System.out.println("enter value of b");
        float b= scanner.nextFloat();

        String result =  (a>b)? "a":"b";
        System.out.println("in between a and b  "  +  (result)  +  "  is largest number");
    }
}
