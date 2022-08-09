public class Task1Lesson3 {
    //1. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
    //If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields
    // the empty string "".
    //For example:
    //"AE_1381" -> "AE"
    //"A" -> "A"
    //"" -> ""

    public static void main(String[] args) {
        System.out.println(getStr("AE_1381"));
        System.out.println(getStr("A"));
        System.out.println(getStr(""));
        }
        public static String getStr(String str) {
            if (str.isEmpty()) {
                System.out.println("String is empty");
            }
        else if (str.length() <= 2){
                System.out.println("String length() <= 2  - " +str);
            }
        else {
            System.out.println(str.substring(0, 2));
        }
        return str;
      }
}






