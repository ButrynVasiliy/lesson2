public class Task4Lesson3 {
    //4. Given a string "ABCDEFGHIJK".
    // You need to make this string lowercased and remove all vowels.
    public static void main(String[] args){
        String alfabet = "ABCDEFGHIJK";
        String newAlfabet = new String(alfabet.toLowerCase());
        System.out.println("toLowerCase = " +newAlfabet);

        String vowelsToRemove = "aei";

        for (char c : vowelsToRemove.toCharArray()) {
            newAlfabet = newAlfabet.replace(String.valueOf(c), "");
        }

        System.out.println(newAlfabet);

        }

}
