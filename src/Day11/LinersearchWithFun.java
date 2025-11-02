package Day11;

public class LinersearchWithFun {
 public static int linearsearch(int[] arr, int target)
 {
     for (int i=0;i<arr.length;i++) {
         if (arr[i] == target)
     return i;

     }
     return -1;

 }
    public static void main(String[] args) {
int[] arr ={10,20,30,40};
int index =linearsearch(arr,30);
        System.out.println("Found at Index: " + index);
    }
}
