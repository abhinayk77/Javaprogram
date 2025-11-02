package Day9;

public class DeleteArray1D {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 50};

        System.out.println("Arraylength is " + numbers.length);
        for(int i=2; i<=numbers.length -1;i++)
        {

            numbers[i] = numbers[i+1];
            System.out.println("number in index of " +i+ "is " + numbers[i]);
        }
    }

}
