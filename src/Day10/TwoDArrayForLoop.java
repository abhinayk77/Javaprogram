package Day10;

public class TwoDArrayForLoop {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 3, 4},
                {4, 2, 6}
        };

        System.out.println("Print for-loop:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
