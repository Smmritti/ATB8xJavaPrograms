package Sept.ex_20092024;

public class Task2 {
    public static void main(String[] args) {
        // Q. Max between 3 numbers using ternary operator
        // a-10, b-20, c-45

        int a=10;
        int b=20;
        int c=45;
        int max = (a>b)? ( (a>c) ? a:c ) : (b>c) ? b:c;
        System.out.println(max);

    }
}
