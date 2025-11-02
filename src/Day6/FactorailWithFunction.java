package Day6;

public class FactorailWithFunction {
    public static int printFactorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num;i++)
        {
            fact *=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num =7;

        System.out.println("factorial of num " + printFactorial(num));

    }
}
