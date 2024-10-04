package Sept.ex_16092024;

public class lab026_String_with_operator {
    public static void main(String[] args) {
        // interview question
        // when '+' is used in case of string then it is called concatenation operator
        // with integer '+' -> used for calculation
        // with string '+' is used for concatenation
        String First_name = "SMRITI";
        String Last_name ="PILIWAR";
        int a =10;
        int b=20;
        System.out.println( First_name + Last_name + a+ b); // if first '+' is string then + operator will do concatenation for all
        System.out.println( First_name + Last_name + (a+ b));// if you want to do concatenation and then calculation part the use ( )
        System.out.println( a+b+ First_name + Last_name); // if first '+' is integer then + operator will do mathematics first and then concatenation


    }
}
