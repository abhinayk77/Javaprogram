package Day3;

public class WithNwithoutParam {
    public void Addwithoutparam() // Add without parameter
    {
        int a =10;
        int b=20;
        int c = a+b;
        System.out.println("sum without parameter : " + c);
    }
    public void Addwithparam(int x, int y) //Add with parameter
    {
        int z =x+y;
        System.out.println("sum with parameter : "+ z);
    }
    public void Subwithoutparam()
    {
        int a =30;
        int b=20;
        int c = a+b;
        System.out.println("sub without parameter : " + c);
    }
    public void Subwithparam(int x, int y) //Add with parameter
    {
        int z =x-y;
        System.out.println("sub with parameter : "+ z);
    }

    public static void main(String[] args) {
    WithNwithoutParam abc = new WithNwithoutParam();
 abc.Addwithoutparam();
 abc.Addwithparam(100,5);
 abc.Subwithoutparam();
 abc.Subwithparam(25,5);
    }
}
