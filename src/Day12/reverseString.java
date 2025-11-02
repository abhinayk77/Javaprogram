package Day12;

public class reverseString {
    public static void main(String[] args) {
//            int number=1234; int reverse=0;
//            while(number!=0)
//            {
//                int num =number % 10;
//                reverse = reverse *10 +num;
//                number/=10;
//            }
//            System.out.println("Reverse Number " + reverse);
        String str = "Automation";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString());

        }
        }



