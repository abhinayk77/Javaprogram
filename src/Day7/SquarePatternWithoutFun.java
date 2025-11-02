package Day7;

public class SquarePatternWithoutFun {
    public static void main(String[] args) {
        int size = 5;
        for(int i =1 ;i<=size;i++){
            for (int j=1;j<=size; j++)
            {
                System.out.printf("* ");
            }
            System.out.println(""); //new line after each row
        }
    }
}
