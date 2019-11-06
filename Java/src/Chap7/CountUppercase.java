package Chap7;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 21:20
 * @Version 1.0
 **/
public class CountUppercase {
    public static void main(String[] args){
        String s = args[0];
        char[] arr = s.toCharArray();
        int sum = 0;//统计多少个大写字母
        for(int i = 0; i < arr.length; i++){
            if((int)arr[i] >= 65 && (int)arr[i] <= 90){
                sum = ++sum;
            }
        }
        System.out.println("The input string has Uppercase numbers is :" + sum);
    }
}
