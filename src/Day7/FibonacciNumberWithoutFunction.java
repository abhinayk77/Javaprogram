package Day7;

public class FibonacciNumberWithoutFunction {
    public static void main(String[] args) {
        int n=10;
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
}
