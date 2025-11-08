package Day7;

public class SquarePattenWithFun {
    public static void printSquare(int size)
    {
        for(int i =1 ;i<=size;i++){
            for (int j=1;j<=size; j++)
            {
                System.out.printf("* ");
            }
            System.out.println(""); //new line after each row
        }
    }
    public static void main(String[] args) {
printSquare(7); //function call
    }
}
