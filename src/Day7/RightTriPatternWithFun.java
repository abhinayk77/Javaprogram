package Day7;

public class RightTriPatternWithFun {
    public static void printTri(int size)
    {
        for(int i =1 ;i<=size;i++){
            for (int j=1;j<=i; j++)
            {
                System.out.printf("* ");
            }
            System.out.println(""); //new line after each row
        }
    }
    public static void main(String[] args) {
        printTri(5); //function call
    }
}
