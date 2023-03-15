package lecture1;

public class DataTypeDemo {
    public static void main(String[] args) {
        String greeting = "Hello World";
        System.out.println("Printing Message: "+greeting);

        /**
         *Size of int is 4 byte.
         * Can store from -2,147,483,648 to 2,147,483,647
         */
        int count = 24;
        System.out.println("Current count is "+count);

        /**
         * Size is 1 byte
         * can store from -128 to 127
         */
        byte data = 'A';
        System.out.println("Byte is "+data);

        byte dataAdd = 'A'+5;
        System.out.println("Byte after addition is "+dataAdd);

        /**
         * Size is 2 byte
         * Can store single character or ASCII value
         */
        char character = 'A';
        System.out.println("Character is "+character);

        char dataFromByte = (char)dataAdd;
        System.out.println("Character from byte is "+dataFromByte);
    }
}
