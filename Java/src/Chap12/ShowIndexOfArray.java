package Chap12;

import java.util.*;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/22 12:56
 * @Version 1.0
 **/
public class ShowIndexOfArray {
    public static void main(String[]args)
    {
        int[] array = new int[100];
        int count = 0;
        for(int i = 0; i < 100 ; i++)
        {
            array[i] = ((int)(Math.random()*100) + 1);
        }
        System.out.println("生成的数组为: ");
        for (int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] + "\t");
            count ++ ;
            if (count % 10 == 0 && count > 0)
            {
                System.out.println();
            }
        }
        while (true)
        {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\n输入数组下标: ");
                int index =  input.nextInt();
                System.out.println("对应的元素值: " + array[index]);
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of Bounds!");
                System.out.println("Please input again,index must be inputed from (0-100)");
                continue;
            }
            break;
        }

    }
}
