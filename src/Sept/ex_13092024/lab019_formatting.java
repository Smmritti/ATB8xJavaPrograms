package Sept.ex_13092024;

public class lab019_formatting {
    public static void main(String[] args) {
        // Formatting -> printf is used for formatting
        // print the table of 2
        // %d - int, byte, short, long
        // %s - string
        // %c - char
        // %f- float, double
        int num =10;
        System.out.printf ( "%d * %d = %d", num,1,num*1);
        System.out.println();
        System.out.printf ( "%d * %d =% d",num,2,num*2);


    }
}
