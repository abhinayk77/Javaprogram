package Day10;

public class TwoDArrayForEach {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6},
                {8, 10, 12}
        };

        System.out.println("Print for-each loop:");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
