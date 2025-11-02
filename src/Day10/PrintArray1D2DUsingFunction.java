package Day10;

public class PrintArray1D2DUsingFunction {
    // Function for 1D array
    static void array1D(int[] arr) {
        System.out.println("1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // new row
    }

    // Function for 2D array
    static void array2D(int[][] arr) {
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new row
        }
    }

    public static void main(String[] args) {
        // Test arrays
        int[] oneD = {1, 2, 3};
        int[][] twoD = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Call functions
        array1D(oneD);
        array2D(twoD);
    }
}
