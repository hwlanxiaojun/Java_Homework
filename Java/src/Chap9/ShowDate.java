package Chap9;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/10 8:42
 * @Version 1.0
 **/
public class ShowDate {
    public static void main(String[] args){
        Date date = new Date();
        int count = 0;
        for (long l = 10000;count < 8 ; count ++ , l*=10){
            date.setTime(l);
            System.out.println(date.toString());
        }
    }
}
