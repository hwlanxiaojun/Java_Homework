package Chap4;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 16:54
 * @Version 1.0
 **/
public class Uppercase {
    public static void main(String[] args){
        int i=(int)(Math.random()*26);
        char ch=(char)(Math.random()*26+'A');
        System.out.print("The random uppercase is：" + ch);
    }
}
