import java.util.Arrays;

public class Task8Lesson3 {
    //8. Given credit card's number 1234 5678 9012 3456.
    // Print card's number in the next view **** **** **** 3456.
    public static void main(String[] args){
        String cardNumber = "1234 5678 9012 3456";
        char [] sicretCardNumber = cardNumber.toCharArray();

        for (int i = 0; i < sicretCardNumber.length; i++){
            if (sicretCardNumber[i] == ' '){
                char f = sicretCardNumber[i];
                sicretCardNumber[i] = f;
            }
            else if (i < sicretCardNumber.length-4){
               char n = '*';
               sicretCardNumber[i] = n;
           }

           else {
               char k = sicretCardNumber[i];
               sicretCardNumber[i] = k;
           }

        }
        System.out.println(sicretCardNumber);


    }
}
