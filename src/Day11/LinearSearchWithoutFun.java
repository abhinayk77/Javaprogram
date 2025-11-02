package Day11;

public class LinearSearchWithoutFun {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;

            }
        }
        System.out.println("Found at Index: " + index);
    }


}
