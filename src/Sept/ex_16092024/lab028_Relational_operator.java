package Sept.ex_16092024;


public class lab028_Relational_operator {
        public static void main(String[] args)
        {
            // relational operators -> are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less than, etc.
            // They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if -else
            // >, < , <= , >= , == , !=  -> boolean
            int a = 10;
            int b = 20;
            boolean c = a > b;
            System.out.println(c);

            int smriti = 25;
            int saloni = 25;
            boolean result = smriti >= saloni; // if it is > = logic will first check '>' if false will check '=' as it is > or =
            System.out.println(result);

        }


    }

