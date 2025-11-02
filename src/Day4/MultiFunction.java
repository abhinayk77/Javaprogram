package Day4;

public class MultiFunction {
    public static String Evenoddnum(int number) {
       // int number = 50;
        if (number % 2 == 0) {
            System.out.println(number + " is Even");

        } else {
            System.out.println(number + " is odd");
        }
        return "";
    }
public static String larger2num(int a, int b)
    {
        if(a>b)
        {
            System.out.println("larger number is :" +a);
        }
        else {
            System.out.println("larger number is :" +b);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(MultiFunction.Evenoddnum(50));
        System.out.println(larger2num(10,20));
    }
}

