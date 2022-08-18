package Lesson2;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((int) (Math.random() * 100) );
            System.out.println(myArray[i]);
        }



    }
}