package Sept.ex_18092024;


public class lab036_Type_Casting {
    public static void main(String[] args) {
        // TYPE CASTING -> Typecasting in Java is the process of converting one data type to another data type using the casting operator.
        //When you assign a value from one primitive data type to another type, this is known as type casting.

        // TYPES
        //There are two types:

        // Widening Type Casting -> lower data type transformed into a higher one
        // It occurs naturally. Since there is no chance of data loss, it is secure.
        // implicit, Explicit,loss less

        //byte b =10;
        //int a = b;       // valid -> implicit casting ->JVM
        //int a = (int)b;  // valid -> explicit casting ->JVM

        //Narrow Type Casting -> process of downsizing a bigger data type into a smaller one ->
        //unsafe because data loss might happen due to the lower data type’s smaller range of permitted values.
        // implicit, Explicit ( with data type), loss

        int val =300;
        //byte b1 = val; // Invalid -> implicit casting ->JVM
        byte b2 = (byte)val; // Invalid -> explicit casting -> loss of data
        System.out.println(b2);



    }


}
