package Day13;

public class LoopUtility {
    // Print star pattern
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
    //print tabel
    public static void printTabel(int num)
    {
        for (int i =1;i<=10; i++)
        {
            // System.out.println(num +"*"+ "i" +"= "+(num*i));
            System.out.println(num*i);
        }
    }
}

