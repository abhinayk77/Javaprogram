package Day11;

public class BubbleSortWithFunction {
    public static void bubbelSort(int[] arr){
int n =arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
int[] arr={2,3,4,5,6};
bubbelSort((arr));
for(int val :arr)
    System.out.printf(val+ " ");
    }
}
