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

        for (int i = 1; i <= 8; i++) {
            for (int n = 1; n <= 8; n++) {
                if (i == n) {
                    System.out.print("*");
                } else if (i == 2 && n == 1) {
                    System.out.print("*");
                }
                else if (i == 3 && n == 1 || i == 3 && n == 2) {
                    System.out.print("*");
                }
                else if (i == 4 && n == 1 || i == 4 && n == 2 || i == 4 && n == 3) {
                    System.out.print("*");
                }
                else if (i == 5 && n == 1 || i == 5 && n == 2 || i == 5 && n == 3 || i == 5 && n == 4) {
                    System.out.print("*");
                }
                else if (i == 6 && n == 1 || i == 6 && n == 2 || i == 6 && n == 3 || i == 6 && n == 4 ||
                        i == 6 && n == 5 ) {
                    System.out.print("*");
                }
                else if (i == 7 && n == 1 || i == 7 && n == 2 || i == 7 && n == 3 || i == 7 && n == 4 ||
                        i == 7 && n == 5 || i == 7 && n == 6) {
                    System.out.print("*");
                }
                else if (i == 8 && n == 1 || i == 8 && n == 2 || i == 8 && n == 3 || i == 8 && n == 4 ||
                        i == 8 && n == 5 || i == 8 && n == 6 || i == 8 && n == 7) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println("Фігура - d)");
                                                          //  loops for d)

        for (int i = 1; i <= 5; i++) {
            for (int n = 1; n <= 9; n++) {
                if (i == 1 && n == 5) {
                    System.out.print("*");
                }
                else if (i == 2 && n == 5 || i == 2 && n == 6 || i == 2 && n == 4 ) {
                    System.out.print("*");
                }
                else if (i == 3 && n == 5 || i == 3 && n == 6 || i == 3 && n == 4 || i == 3 && n == 7 || i == 3 && n == 3 ) {
                    System.out.print("*");
                }
                else if (i == 4 && n == 5 || i == 4 && n == 6 || i == 4 && n == 4 || i == 4 && n == 7 || i == 4 && n == 3
                        || i == 4 && n == 2 || i == 4 && n == 8) {
                    System.out.print("*");
                }
                else if (i == 5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}