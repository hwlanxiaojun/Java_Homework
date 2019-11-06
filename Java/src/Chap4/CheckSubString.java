package Chap4;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 20:21
 * @Version 1.0
 **/
public class CheckSubString {
    public static void main(String[] args){
        System.out.print("Enter string s1:");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        System.out.print("Enter string s2:");
        String s2 = input.next();
        if (s1.contains(s2))
            System.out.println(s2 + "is a substring of " + s1);
        else
            System.out.println(s2 + "is not a substring of " + s1);
    }
}
