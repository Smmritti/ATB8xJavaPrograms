package Sept.ex_20092024;

public class lab057_ex6 {
    // Grade calculator
    //1. find the user inputs
    // score ->int score =89;
    // return-> data type -> grade -> char
    // 2. basic logic
    // if score >=90 && <=100 -> A
    // else if score <=89 && >=80- > B
    // else if <=79 && >=70-> C
    // else if <=69 && >=60 -> D,
    // else if <=59 && >=50 -> E
    // else 59
    public static void main(String[] args) {
        char grade = 'F';
        int score = 0;
        if ( score >=90 && score <=100){
            grade ='A';
        }
        else if( score >= 80 &&  score <= 89){
            grade = 'B';
        }
        else if( score >=70 &&  score <=79){
            grade = 'C';
        }
        else if (score >= 60 &&  score <= 69){
            grade = 'D';
        }
        else if (score >=50 &&  score <= 59) {
            grade = 'E';
        }
        else if ( score<= 0 || score >100){
            System.out.println(" LOL! are you god!");
            grade = 'O';
        }
        else grade = 'F';
        System.out.println( "Your Grade is "+ grade);
    }

}
