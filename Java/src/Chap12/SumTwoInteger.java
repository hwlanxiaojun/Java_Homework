package Chap12;

import java.util.*;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/22 10:18
 * @Version 1.0
 **/
public class SumTwoInteger {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        while(true)
        {
            try {
                a = input.nextInt();
                b = input.nextInt();
                System.out.println("Sum is "+(a+b));
            }
            catch (InputMismatchException e)
            {
                input.nextLine();
                System.out.println("Incorrect input and re-enter two integers:");
                continue;
            }
            break;
        }
    }
}
