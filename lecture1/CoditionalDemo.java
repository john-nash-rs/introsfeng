package lecture1;

public class CoditionalDemo {
    public static void main(String[] args) {
        boolean isMale = true;
        printGender(isMale);
        isMale = false;
        printGender(isMale);

        genderClassifier("Boy");
        genderClassifier("Girl");
        genderClassifier("Man");
        genderClassifier("Woman");
    }

    private static void genderClassifier(String word) {
        switch (word) {
            case "Boy":
                System.out.println("Gender:: Male");
            case "Girl":
                System.out.println("Gender:: Female");
            case "Man":
                System.out.println("Gender:: Male");
            case "Woman":
                System.out.println("Gender:: Female");
        }
    }

    private static void printGender(boolean isMale) {
        if(isMale){
            System.out.println("Gender:: Male");
        } else {
            System.out.println("Gender:: Female");
        }
    }
}
