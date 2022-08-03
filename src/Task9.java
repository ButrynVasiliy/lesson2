import java.util.Arrays;

public class Task9 {
    public static void main(String[] args){
        int [] sortArray = new int [10];
        for (int n = 0; n < sortArray.length; n++){
            sortArray[n] = ((int) (Math.random()*100));
        }
        System.out.println("Масив випадкових чисел - " +Arrays.toString(sortArray));
        for (int i = 0; i < sortArray.length; i++){
            int min = sortArray[i];
            int id_min = i;
            for (int j = i+1; j < sortArray.length; j++){
                if (sortArray[j] < min){
                    min = sortArray[j];
                    id_min = j;
                }
            }
            if ( i != id_min){
                int virtual = sortArray[i];
                sortArray[i] = sortArray[id_min];
                sortArray[id_min] = virtual;
            }
        }
        System.out.println(Arrays.toString(sortArray));

    }
}
