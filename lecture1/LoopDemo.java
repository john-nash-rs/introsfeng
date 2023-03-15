package lecture1;

public class LoopDemo {
    public static void main(String[] args) {
        /**
         * Print number from 1 to 10 using for loop
         */
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("**********");
        /**
         * Print number from 1 to 10 using while loop
         */
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("**********");
        /**
         * Print number from 1 to 10 using do while loop
         */
        i = 1;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i <= 10);
    }
}
