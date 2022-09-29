import java.util.*;

public class LargestGap {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> largestGap;
        List<Integer> arrOfInputs = getArrOfInputs(scanner);

        Collections.sort(arrOfInputs);
        while (true) {
            try {
                largestGap = getLargestGap(arrOfInputs);
                System.out.println("Largest gap between " + largestGap.get(0) + " and " + largestGap.get(1) + " is "
                        + (largestGap.get(1) - largestGap.get(0)));
                break;
            } catch (Exception e) {
                e.printStackTrace();
                arrOfInputs = getArrOfInputs(scanner);
            }
        }
        scanner.close();
    }

    private static List<Integer> getArrOfInputs(Scanner scanner) {
        while (true) {
            System.out.print("Enter set of integers between -2147483648 and 2147483647 inclusive: ");
            String strOfValues = scanner.nextLine().trim();
            try {
                return arrOfInputs(strOfValues);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Integer> arrOfInputs(String strOfValues) throws Exception {
        if (strOfValues.length() < 1) {
            throw new Exception("No data was provided.");
        }

        List<Integer> arrOfInputs = new ArrayList<>();
        StringBuilder placeHolder = new StringBuilder();
        for (int i = 0; i < strOfValues.length(); i++) {
            if (Character.isDigit(strOfValues.charAt(i)) || Character.isSpaceChar(strOfValues.charAt(i))) {
                if (Character.isDigit(strOfValues.charAt(i))) {
                    placeHolder.append(strOfValues.charAt(i));
                } else {
                    if (placeHolder.length() > 0) {
                        arrOfInputs.add(Integer.parseInt(placeHolder.toString()));
                        placeHolder = new StringBuilder();
                    }
                }
            } else {
                throw new Exception("Only numeric and space characters are acceptable.");
            }
        }
        arrOfInputs.add(Integer.parseInt(placeHolder.toString()));
        return arrOfInputs;
    }

    private static List<Integer> getLargestGap (List<Integer> arrOfInputs) throws Exception{
        if (arrOfInputs.size() < 2) {
            throw new Exception("Expected two or more numeric values. One was provided.");
        }

        int maxGap = -1;
        List<Integer> arrMapGap = new ArrayList<>();
        for (int i = 1; i < arrOfInputs.size(); i++) {
            if (arrOfInputs.get(i) - arrOfInputs.get(i-1) > maxGap) {
                maxGap = arrOfInputs.get(i) - arrOfInputs.get(i-1);
                arrMapGap.clear();
                arrMapGap.add(arrOfInputs.get(i-1));
                arrMapGap.add(arrOfInputs.get(i));
            }
        }
        return arrMapGap;
    }
}
