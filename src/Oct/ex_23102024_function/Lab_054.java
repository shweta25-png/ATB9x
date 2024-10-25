package Oct.ex_23102024_function;

public class Lab_054 {
    public static void main(String[] args) {

        //2.Without Parameters but With Return Type
        String return_value = greet_with_hello();
        System.out.println(return_value);



    }
    static String greet_with_hello(){
        System.out.println("hi , how are you");
        return ("i am doing great");
    }
}
