package Chap7;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 21:11
 * @Version 1.0
 **/
public class CountInteger {
    public static void main(String[] args){
        int sum=0;
        System.out.println("numbers："+args.length);
        for(String arg:args) {
            sum += Integer.parseInt(arg); //将字符串类型转化为整型并求和
        }
        System.out.println("The numbers count is " + sum);
    }
}
