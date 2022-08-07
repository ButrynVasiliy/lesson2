import java.util.Arrays;

public class Task7Lesson3 {
    //Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the
    // following string each from a new line.
    //   Example:
    //   Den
    //   John
    //   Will
    //   Kate
    //   ...
    public static void main(String[] args){

        String name = "Den, John, Will, Kate, Adam, Robin";
        String all = String.join("\n","Den", "John", "Will", "Kate", "Adam", "Robin");
        System.out.println(all);

    }

}
