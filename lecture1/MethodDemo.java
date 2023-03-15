package lecture1;

public class MethodDemo {
    public static void main(String[] args) {
        int result = addition(10, 14);
        System.out.println("Result is "+result);
    }

    private static int addition(int param1, int param2) {
        return param1 + param2;
    }
}
