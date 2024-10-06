package Sept.ex_20092024;

public class Task {
    public static void main(String[] args) {
        // condition ? expression_if_true : expression_if_false
        // TERNARY OPERATOR TO HANDLE MULTIPLE CONDITION:
        // Q. input -> int score =85
        // string grade
        //score >= 90 > A
        //score >= 80 > B
        //score >=70 > C
        int score = 85;
        String Grade = (score >= 90)? "A" : (score >= 80)? "B": (score >= 70)? "C" : "F";
        System.out.println(Grade);


    }



}
