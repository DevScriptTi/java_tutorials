package itearations;

public class Itearations {
    public static void main(String args[]) {
        // s = 1 + 2 + 3 + ..... n ;
        // for loop
        for (int i = 0; i < 10; i++) { // initialazation ... testing... body .... increment ... testing ... body ...
                                       // increment
            System.out.println("Hello World! " + i);
        }

        // while loop

        int i = 0;
        while (i < 10) {
            System.out.println("Hello World! " + i);
            i++;
        }

        // do while loop
        int j = 0;
        do {
            System.out.println("Hello World! " + j);
            j++;
        } while (j < 0);

    }
}
