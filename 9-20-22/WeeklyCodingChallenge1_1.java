import java.util.Arrays;
import java.util.Scanner;

public class WeeklyCodingChallenge1_1 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTriples = 0;

        while (true) {
            System.out.print("Enter number of triples: ");
            String userInputNumOfTriples = scanner.nextLine().trim();
            if (checkUserInputNumOfTriples(userInputNumOfTriples)) {
                numberOfTriples = Integer.parseInt(userInputNumOfTriples);
                break;
            }
        }

        for (int i = 0; i < numberOfTriples; i++) {
            while (true) {
                System.out.print("Enter set of triples: ");
                String userInputSetOfTriples = scanner.nextLine().trim();
                if (checkUserInputSetOfTriples(userInputSetOfTriples)) {
                    getSolution(userInputSetOfTriples.split(" "));
                    break;
                }
            }
        }
        scanner.close();
    }

    private static boolean checkUserInputNumOfTriples(String userInput) {
        if (userInput.length() == 0) {
            return false;
        }

        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkUserInputSetOfTriples(String userInput) {
        if (userInput.length() < 5) {
            return false;
        }

        int numOfSpaces = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                if (!Character.isSpaceChar(userInput.charAt(i))) {
                    return false;
                }
                numOfSpaces ++;
            }
            if (numOfSpaces > 2) {
                return false;
            }
        }
        return true;
    }

    private static void getSolution(String[] setOfNumbers) {
        Arrays.sort(setOfNumbers);
        System.out.println(Integer.parseInt(setOfNumbers[1]));
    }
}
