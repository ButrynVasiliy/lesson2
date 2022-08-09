public class Task3Lesson3 {
    //3. Given two strings. Check if they start with "The".
    //
    //   Task: word1 = "The End", word2="End The";
    public static void main(String[] args){
        String s1 = "The End";
        String s2 = "End The";
        System.out.println(s1.startsWith("The",0));
        System.out.println(s2.startsWith("The",0));
    }

}
