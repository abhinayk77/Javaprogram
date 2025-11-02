package Day7;

public class FibonacciNumberWithFunction {
    public static void printFibonacci(int n)
    {
        int FirstNumber = 0;
        int SecondNumber =1;
        System.out.println("Fibonacci : " + FirstNumber+" "+SecondNumber+" ");
        for (int i=2;i<n;i++)
        {
            int next =FirstNumber + SecondNumber;
            System.out.println(next+"");
            FirstNumber=SecondNumber;
            SecondNumber=next;
        }


    }

    public static void main(String[] args) {
        printFibonacci(10);
    }
}
