public class Task7 {
    public static void main(String[] args){

        int sum = 0;
        int[] sumArray = { 12, 6, 1, 4, 9, 5, 16, 11, 7, 100 };
        for (int i = 1; i < sumArray.length-1; i++){
            sum = sum + sumArray[i];


        }
        System.out.println("Сума єементів масиву крім першого і останього = " +sum);

    }
}
