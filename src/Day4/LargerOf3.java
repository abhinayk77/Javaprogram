package Day4;

public class LargerOf3 {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=7;
        if(a>b && a>c)
        {
            System.out.println("larger number: " + a);
        } else if (b>a && b>c) {
            System.out.println("larger number :" + b);
        }
            else{
                System.out.println("larger number :" +c);
            }

        }
    }

