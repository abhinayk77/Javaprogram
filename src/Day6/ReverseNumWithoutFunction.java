package Day6;

public class ReverseNumWithoutFunction {
    public static void main(String[] args) {
        int number=1234; int reverse=0;
        while(number!=0)
        {
            int num =number % 10;
            reverse = reverse *10 +num;
            number/=10;
        }
        System.out.println("Reverse Number " + reverse);
    }
}
