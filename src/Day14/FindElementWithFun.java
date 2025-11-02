package Day14;

public class FindElementWithFun {
    public static void main(String[] args)
    {
        int[] array = {1, 2, 4, 5, 6};
        printMissing(array, 6);
    }

    public static void printMissing(int[] arr, int max)
    {
        for (int num = 1; num <= max; num++)
        {
            boolean isFound = false;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == num)
                {
                    isFound = true;
                    break;
                }
            }
            if (!isFound)
            {
                System.out.println("Missing: " + num);
            }
        }
    }
}
