

package BasicPart1;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input the 2 number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1 == number2)
                System.out.printf("%d==%d\n", number1,number2);
        if( number1 != number2)
            System.out.printf("%d!=%d\n",number1,number2);
        if(number1 > number2)
            System.out.printf("%d>%d\n",number1,number2);
        if(number1 >= number2)
            System.out.printf("%d>=%d\n",number1,number2);
        if(number1 <= number2)
            System.out.printf("%d<=%d\n",number1,number2);
        sc.close();


    }
}