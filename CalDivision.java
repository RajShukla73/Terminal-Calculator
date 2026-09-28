public class CalDivision {

    public static int division(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }

        return num1 / num2;
    }
}
