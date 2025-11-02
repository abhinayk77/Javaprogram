package Day10;

public class TwoDArray {
    public static void main(String[] args) {
        //Combined  Declaration + Creation + Initialization
        int[][] matrix = {    //
                {3, 2, 4},
                {1, 8, 6},
                {7, 4, 5}
        };

        // Print the 2D array
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // next line
        }
    }
}
