package Sept.ex_18092024;

public class Task2 {
    public static void main(String[] args) {
        // Q. int a=10;
        // println (--a + a++ + a-0)
        // println (a)
        int a= 10;
        System.out.println(--a + a++ + a-0);
        System.out.println(a);
        // A -> --a -> 9
        // B -> a++ -> a-> 9 , B-> 10
        // C-> a-0 -> 10
    }
}
