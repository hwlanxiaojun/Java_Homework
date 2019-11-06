package Chap3;

import java.util.*;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 16:25
 * @Version 1.0
 **/
public class RandomMonth {
    public static void main(String[] args) {
        int m = 1+(int)(Math.random()*12);
        switch (m){
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4:System.out.println("Apirl");
                break;
            case 5:System.out.println("May");
                break;
            case 6:System.out.println("June");
                break;
            case 7:System.out.println("July");
                break;
            case 8:System.out.println("August");
                break;
            case 9:System.out.println("September");
                break;
            case 10:System.out.println("October");
                break;
            case 11:System.out.println("November");
                break;
            default:System.out.println("December");
        }
    }
}
