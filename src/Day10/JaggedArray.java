package Day10;

public class JaggedArray {
    public static void main(String[] args) {
        // Step 1: Declare jagged array with 3 rows
        int[][] jagged = new int[2][];

        // Step 2: Assign different sizes to each row
        jagged[0] = new int[2]; // 2 elements
        jagged[1] = new int[3]; // 3 elements

        // Step 3: Assign values
        jagged[0][0] = 10;
        jagged[0][1] = 20;

        jagged[1][0] = 10;
        jagged[1][1] = 30;
        jagged[1][2] = 40;

        // Step 4: Print the jagged array
        System.out.println("Jagged Array Output:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
