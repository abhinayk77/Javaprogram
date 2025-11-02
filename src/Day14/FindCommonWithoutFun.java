package Day14;
//Find common elements in 2 Arrays
public class FindCommonWithoutFun {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 4, 5, 9};

        System.out.println("Common elements:");
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]); //common elements
                }
            }
        }
    }
}
