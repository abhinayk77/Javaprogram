package Day14;

public class FindMissingWithOutFun {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5,6};
            int expected = arr.length + 1;  // total number of elements if none were missing

            int totalSum = expected * (expected + 1) / 2; // Sum of first n natural numbers
            int Sum = 0;

            for (int num : arr) {
                Sum += num;
            }

            int missingNumber = totalSum - Sum;
            System.out.println("The missing number is: " + missingNumber);
        }
    }

