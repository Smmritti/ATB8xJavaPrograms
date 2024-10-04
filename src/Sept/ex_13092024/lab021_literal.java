package Sept.ex_13092024;

public class lab021_literal {
    public static void main(String[] args) {
        //literal - > Any constant value which can be assigned to the variable is called literal/constant.
        // First type -> boolean -> true or false
        boolean is_married = true;
        // 2nd type -> integer literal -> 4 types->
        //1.Decimal literal - These are the set of numbers that consist of digits from 0 to 9. It may have a positive (+) or negative (-).
        int age = 78;
        //binary literal - Base 2, whose digits consists of the numbers 0 and 1
        int binary_no= 0b1010;
        //octal literal -> It is a combination of number have digits from 0 to 7 with a leading 0. base is 8.
        int octal = 045;
        //Hexa-Decimal: The sequence of digits preceded by 0x or 0X is considered as hexadecimal integers.base 16. it can be used to store color of a button;
        int hex = 0Xface; // can also be written as #28a745
        // 3rd type -> char ->
        // single char
        char c1 = 'a';
        char c2 ='@';
        // Escape char -> help us to format our strings accurately
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';


        System.out.println(" smriti" + new_line + "pilliwar");
        System.out.println(" smriti" + tab_line + "pilliwar");
        System.out.println(" smriti" + back_space + "pilliwar");
        System.out.println(" smriti" + car_r + "pilliwar");


    }
}
