package Lesson2;

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

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                for (int n = 1; n <= 8; n++) {
                    System.out.print("*");
                }
            }else if (i != 1 || i != 5 ) {
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

        for (int i = 1; i <= 7; i++) {
            for (int n = 1; n <= 7; n++) {
                if (i == n) {
                    System.out.print("*");
                } else if (i == 2 && n == 1) {
                    System.out.print("*");
                }
                else if (i == 3 && n == 1 || i == 3 && n == 2) {
                    System.out.print("*");
                }
                else if (i == 4 && n != 7 && n != 6 && n != 5) {
                    System.out.print("*");
                }
                else if (i == 5 && n != 7 && n != 6) {
                    System.out.print("*");
                }
                else if (i == 6 && n != 7) {
                    System.out.print("*");
                }
                else if (i == 7) {
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
                else if (i == 2 && n == 5 || i == 2 && n == 6 || i == 2 && n == 4) {
                    System.out.print("*");
                }
                else if (i == 3 && n != 9 && n != 1 && n != 8 && n != 2) {
                    System.out.print("*");
                }
                else if (i == 4 && n != 9 && n != 1) {
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