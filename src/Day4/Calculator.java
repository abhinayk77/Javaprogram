package Day4;

public class Calculator {
    public static void main(String[] args) {
        int num1=10,num2=5;
       char operator ='*';
      //  System.out.println("enter operator (+,-,*,/):");
        switch (operator){
            case '+':
                System.out.println("Result :" +(num1+num2));
                break;
            case '-':
                System.out.println("Result :" +(num1-num2));
                break;
            case '*':
                System.out.println("Result :" +(num1*num2));
                break;
            case '/':
                System.out.println("Result :" +(num1/num2));
                break;

        }
    }
}
