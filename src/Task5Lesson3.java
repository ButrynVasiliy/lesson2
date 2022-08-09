public class Task5Lesson3 {
    //Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter
    // string on the outside and the longer string on the inside.
    //
    //   Task: a = "hop", b = "hello"
    public static void main(String[] args){

        String a = "hop";
        String b = "hello";
        StringBuilder result;
                if ( a.length() < b.length()) {
                    result = new StringBuilder(a + " " + b + " " + a);
                }
                else {
                    result = new StringBuilder(b + " " + a + " " + b);
                }
        System.out.println(result);

    }
}
