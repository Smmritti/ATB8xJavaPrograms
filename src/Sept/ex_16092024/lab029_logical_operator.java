package Sept.ex_16092024;

public class lab029_logical_operator {
    public static void main(String[] args) {
        // logical operator ->Logical operators are used to perform logical “AND”, “OR” and “NOT” operations.
        // return boolean value
        // in case of OR everything is TRUE only false - false is false
        // in case of AND everything is FALSE only true - true is true
        // && - AND , || - OR  , !- NOT
        boolean a = true;
        boolean b = true;
        boolean c = a&&b;
        System.out.println(c);
        System.out.println(!c);  // ! will make true to false and false to true



    }
}
