public class Task6 {
    public static void main(String[] args) {
        System.out.println("Фігура -a)");
                                                    //  loops for a)
               for (int i = 1; i <= 8; i++ ){
                   for (int n = 1; n <= 8; n++ ){
                      System.out.print("*");
                  }
                   System.out.println();
             }
        System.out.println("Фігура - b)");
                                                     //  loops for b)

        for (int i = 1; i <= 8; i++) {
                if (i == 1 || i == 8) {
                for (int n = 1; n <= 8; n++) {
                    System.out.print("*");
                }
            }else if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 ) {
                    for (int n = 1; n <= 8; n++) {
                        if (n == 1 || n == 8) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }

                    }
                }
            System.out.println();
                }

        System.out.println("Фігура - c)");
                                                       //  loops for c)



            }
        }