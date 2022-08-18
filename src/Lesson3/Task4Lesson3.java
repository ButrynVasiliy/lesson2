package Lesson3;

public class Task4Lesson3 {
    //4. Given a string "ABCDEFGHIJK".
    // You need to make this string lowercased and remove all vowels.
    public static void main(String[] args){
        String alfabet = "ABCDEFGHIJK";
        alfabet = alfabet.toLowerCase();

         System.out.println("toLowerCase = " +alfabet);

        String vowelsToRemove = "aei";

        for (char c : vowelsToRemove.toCharArray()) {
            alfabet = alfabet.replace(String.valueOf(c), "");
        }

        System.out.println(" After to removes vowels  - " + alfabet);

        }

}
