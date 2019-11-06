package Chap3;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 16:42
 * @Version 1.0
 **/
public class CoinTossingGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int coin=(int)(Math.random()*2);

        System.out.print("Enter the both the front of coin you are guessing:");
        int guess = input.nextInt();

        if (guess==coin)
            System.out.println("You are right!");
        else
            System.out.println("You are wrong!");
    }
}
