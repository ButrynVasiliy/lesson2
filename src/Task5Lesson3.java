public class Task5Lesson3 {
    //Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter
    // string on the outside and the longer string on the inside.
    //
    //   Task: a = "hop", b = "hello"
    public static void main(String[] args){

        String a = "hop";
        String b = "hello";
                if ( a.length() < b.length()) {
                    StringBuilder result = new StringBuilder(a + " " + b + " " + a);
                    System.out.println(result);
                }
                else {
                    StringBuilder resultOther = new StringBuilder(b + " " + a + " " + b);
                    System.out.println(resultOther);
                }

    }
}
