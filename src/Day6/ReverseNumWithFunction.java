package Day6;

public class ReverseNumWithFunction {
    public static int printReverseNum(int number)
    {
int reverse =0;
        while(number!=0)
        {
            int num =number % 10;
            reverse = reverse *10 +num;
            number/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number=9876;
        System.out.println("Reverse number are " + printReverseNum(number));
    }
}
