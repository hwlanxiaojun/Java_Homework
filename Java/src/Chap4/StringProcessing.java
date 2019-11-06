package Chap4;

import java.util.*;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 17:00
 * @Version 1.0
 **/
public class StringProcessing {
    public static void main(String[] args){
        System.out.print("请输入一个字符串:");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("字符串"+s+"的长度为"+s.length());
        System.out.println("字符串"+s+"的第一个字符为"+s.charAt(0));
    }
}
