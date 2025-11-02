package Day13;

public class ArrayUtility {
    public static void findMaxMin(int[] arr){
        int max =arr[0];
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("max: " + max);
        System.out.println("min: "+ min);
    }
    public static void findDuplicate(int[] arr) {
        System.out.println("Duplicate: ");
        for(int i=0;i< arr.length; i++)

            for(int j=i+1;j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }

    }
}
