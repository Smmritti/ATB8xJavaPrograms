package Sept.ex_18092024;

public class lab038_ex1 {
    public static void main(String[] args) {
        // GST =18.45
        int course =100;
        float gst = 10.45f;
        //int totalfee = course + gst; //Narrowing -> implicit -> invalid -> JVM
        int totalfee = course + (int)gst;// //Narrowing -> explicit -> invalid -> loss ->JVM
        System.out.println(totalfee);


    }
}
