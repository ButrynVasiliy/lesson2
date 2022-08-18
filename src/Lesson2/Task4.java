package Lesson2;

public class Task4 {
    public static void main(String[] args){
        int[] myArray = new int[10];
        int[] nums2 = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
        for (int i = 0; i < nums2.length; i++){
            myArray[i] = ((int) Math.sqrt(nums2[i]));
            System.out.println(myArray[i]);
        }


    }
}
