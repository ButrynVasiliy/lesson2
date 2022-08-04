import java.util.Arrays;
// Необхідно знайти два максимальних числа в масиві, але максимальні числа не маєть дублюватися.
public class Task10 {
    public static void main(String[] args){
        int[] array = {4,5,0,-2,5};
        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int id_min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    id_min = j;
                }
            }
            if ( i != id_min){
                int virtual = array[i];
                array[i] = array[id_min];
                array[id_min] = virtual;
            }
        }
        System.out.println(Arrays.toString(array));
        // максимальне число в масиві, але максимальні числа не маєть дублюватися.
        int max = array[array.length-1];
             for (int j = array.length-3; j < array.length; j++)
                 {
                     if (array[j] != max) {
                         System.out.println("[ " +array[j] + ", " + max +" ]");
                     }
                 }
             }
}
