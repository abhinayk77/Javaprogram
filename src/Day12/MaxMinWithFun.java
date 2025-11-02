package Day12;

public class MaxMinWithFun {
    public static void main(String[] args) {
        int [] arr ={4,7,2,9,1,5};
        findMaxMin(arr);

    }

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
}
