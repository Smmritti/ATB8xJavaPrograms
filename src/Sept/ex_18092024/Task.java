package Sept.ex_18092024;


public class Task {
    public static void main(String[] args) {
        // Q. give some another example of widening with implicit and explicit , Narrowing with implicit and explicit
        // narrowing
        int automation_course = 4500;
        //byte total = automation_course;     // implicit
        byte total = (byte)automation_course;// explicit
        System.out.println(total);

        //widening
        //byte roll_no = 100;
        //int exam = roll_no;    // implicit
        //System.out.println(exam);
        //int exam = (int)roll_no;   // explicit
        //System.out.println(exam);

    }

}
