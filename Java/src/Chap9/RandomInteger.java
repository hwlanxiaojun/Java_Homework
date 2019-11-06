package Chap9;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/10 8:50
 * @Version 1.0
 **/
public class RandomInteger {
    public static void main(String[] args){
        Random random = new Random(1000);
        for (int i = 0;i < 50 ; i++)
            System.out.print(random.nextInt(100) + " ");
        System.out.print("\n");
    }
}
