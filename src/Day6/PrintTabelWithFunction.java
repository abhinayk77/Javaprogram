package Day6;

public class PrintTabelWithFunction {
    public static void printTabel(int num)
    {
        for (int i =1;i<=10; i++)
        {
            // System.out.println(num +"*"+ "i" +"= "+(num*i));
            System.out.println(num*i);
        }
    }

    public static void main(String[] args) {
int num=15;
PrintTabelWithFunction.printTabel(num);
    }
}
