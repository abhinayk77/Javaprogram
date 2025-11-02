package Day13;

public class Main {
    public static void main(String[] args) {

        int[] nums = {10, 20, 5, 20, 35};
        System.out.println("\nTable of 6:");
        LoopUtility.printTabel(6);

        System.out.println("\nStar Pattern:");
        LoopUtility.printSquare(5);
        System.out.println("\nMax");
        ArrayUtility.findMaxMin(nums);
        System.out.println("\nDuplicate value is:");
        ArrayUtility.findDuplicate(nums);
    }

}
