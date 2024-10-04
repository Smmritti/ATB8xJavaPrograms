package Sept.ex_16092024;

import org.w3c.dom.ls.LSOutput;

public class Task {
    public static void main(String[] args) {

        // Q. Difference between = and == ?
        // = is an assignment operator which is used for assigning value to a variable and
        // == is a relational operator which is used to compare 2 values are equal or not, return true if equal and false if not

        // Q. Byte b = 10; and long l = 10l; , how much byte will be used?
        // byte b uses 1 byte of memory as it has 1 byte and 8 bits
        // long l uses 8 byte of memory as it has 8 byte and 64 bits and there are 8 bits in a byte

        // Q. Byte b = 10; byte c = 20; what is the ans of b+c , what is the data type it wll give in result?
        //byte b=10;
        //byte c=20;
        //System.out.println( b+c); // it will give integer.

        // Q. Short s=10;
        // char c= 'A';//65, int ss = s+c;
        //System.out.println(ss);

        Short s = 10;
        char c = 'A';
        int ss = s+c;
        System.out.println(ss);





    }


}
