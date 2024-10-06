package Sept.ex_18092024;

public class lab045_ex5 {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println( a );
        System.out.println( ++a + a++ + a++ );
        System.out.println( a );
        // A -> ++a -> 11
        // +
        // B -> a ++ -> a -> 11 -> B-> 12
        //+
        // C -> a ++ -> a -> 12-> C-> 13

    }
}
