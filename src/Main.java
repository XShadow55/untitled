import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final List<Integer> weights = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    private static final int maxCarryWeight = 5;
    private static final int maxTrips = 10;

    public static void main(String[] args) {
        int s = getMaxCarrots();
        System.out.println(s);
    }

    public static int getMaxCarrots(){
        weights.sort(Collections.reverseOrder());
        int totalWeight = 0;
        for (int i = 0; i < maxTrips; i++) {
            int remainingWeight = maxCarryWeight;
            for (Integer field : weights) {
                if (remainingWeight >= field) {
                    totalWeight += field;
                    remainingWeight -= field;
                }
            }
        }
        return totalWeight;
    }

}

