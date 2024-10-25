package Oct.ex_23102024_function;

import javax.swing.*;

public class Lab_055 {
    public static void main(String[] args) {
        //3.With Parameters and Without Return Type(90% this is used in java )
        greet_with_your_name("Pramod");
        greet_with_your_name("Amit");
        greet_with_your_name("Balaji");

        // greet_with_your_name();

       greet_with_firstname_lastname("shweta","machiwar");


    }
   static void  greet_with_your_name (String name) {
       System.out.println("hi . my name is" + name);
   }

   static void greet_with_firstname_lastname (String firstname , String lastname ){

       System.out.println("my name is "+ firstname +" "+ lastname);

   }




}
