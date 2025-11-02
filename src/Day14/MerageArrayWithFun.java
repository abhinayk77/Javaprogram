package Day14;

public class MerageArrayWithFun {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6};
        int[] arr2 = {3,5,7};
       merge(arr1,arr2);
    }
    public static void merge(int[] arr1,int[] arr2){
        int [] c = new int[arr1.length+ arr2.length];

        for(int i=0;i<arr1.length;i++)
        {
        c[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            c[arr1.length+j] = arr2[j];
        }
        for(int k=0;k < c.length;k++){
        System.out.print(c[k] + " ");
    }
}
}
