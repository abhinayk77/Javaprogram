package Day12;

public class FindDuplicateWithFun {
    public static void main(String[] args) {
        int [] arr ={4,5,8,4,3,5};
        findDuplicate(arr);

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
