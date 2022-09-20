import java.util.Scanner;

public class WeeklyCodingChallenge1_2 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner scanner = new Scanner(System.in);
        int inputNumOfTests = getNumOfTests(scanner);

        for (int i = 0; i < inputNumOfTests; i++) {
            String inputAlphanumericString = getAlphanumericString(scanner);
            showSumOfAllDigits(inputAlphanumericString);
        }
        scanner.close();
    }

    private static int getNumOfTests(Scanner scanner) {
        while (true) {
            System.out.print("Enter number of tests: ");
            String numOfTests = scanner.nextLine().trim();
            if (checkInputNumOfTests(numOfTests)) {
                return Integer.parseInt(numOfTests);
            }
        }
    }

    private static boolean checkInputNumOfTests(String userInput) {
        if (userInput.length() < 1) {
            return false;
        }

        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String getAlphanumericString(Scanner scanner) {
        while (true) {
            System.out.print("Enter alphanumeric string: ");
            String alphanumericString = scanner.nextLine().trim();
            if (!checkAlphanumericString(alphanumericString)) {
                return alphanumericString;
            }
        }
    }

    private static boolean checkAlphanumericString(String userInput) {
        if (userInput.length() < 1) {
            return false;
        }

        for (int i = 0; i < userInput.length(); i++) {
            if ((!Character.isDigit(userInput.charAt(i))) || (!Character.isAlphabetic(userInput.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private static void showSumOfAllDigits(String userInput) {
        int totalSum = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isDigit(userInput.charAt(i))) {
                totalSum += Integer.parseInt(userInput.charAt(i) + "");
            }
        }
        System.out.println(totalSum);
    }
}
