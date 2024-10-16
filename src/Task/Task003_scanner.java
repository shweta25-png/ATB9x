package Task;

import java.util.Scanner;

public class Task003_scanner {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name-");
       String name = scanner.next();

        System.out.println("enter your age");
        int age= scanner.nextInt();

        System.out.println("enter your salary");
        float salary= scanner.nextFloat();

        scanner.close();

    }
}
