package Sept.ex_18092024;

public class lab037_ex {
    public static void main(String[] args) {
        long phone = 9850266641l;
        //short s = phone; // Narrowing -> implicit -> JVM will not allow and throw error ->Invalid
        short s1 = (short)phone; //Narrowing -> explicit -> JVM will allow but data loss  ->Invalid


    }
}
