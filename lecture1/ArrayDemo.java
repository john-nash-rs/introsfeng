package lecture1;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = {"Tom", "Harry", "Bruno", "Alisa"};
        System.out.println(" First element of array is "+names[0]);
        System.out.println(" Second element of array is "+names[1]);
        System.out.println(" Third element of array is "+names[2]);
        System.out.println(" Fourth element of array is "+names[3]);

        /**
         * Array can be of any kind. It can be of string. It can be of integer.
         * It can also be of byte or even classes.
         */
        Integer[] numbers = {100, 200, 300, 400};
        System.out.println(" First element of array is "+numbers[0]);
        System.out.println(" Second element of array is "+numbers[1]);
        System.out.println(" Third element of array is "+numbers[2]);
        System.out.println(" Fourth element of array is "+numbers[3]);

    }
}

