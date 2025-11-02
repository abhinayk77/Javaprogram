package Day7;

public class InvertedTriWithFun {
    public static void printInvertedTri(int size)
    {
        for(int i =size ;i>=1;i--){
            for (int j=1;j<=i; j++)
            {
                System.out.printf("* ");
            }
            System.out.println(""); //new line after each row
        }
    }
    public static void main(String[] args) {
        printInvertedTri(5); //function call
    }
}
