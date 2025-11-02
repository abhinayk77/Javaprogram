package Day12;

public class SecondMaxWithFun {
    public static void main(String[] args) {
        int[] arr ={5,3,9,1,7};
        int secondMax = findSecondMax(arr);
        System.out.println("2nd Max: " + secondMax);

    }
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
        }
    }

