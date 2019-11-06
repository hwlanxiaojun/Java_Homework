package Chap7;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 20:51
 * @Version 1.0
 **/
public class RandomSelect {
    public static int getRandom(int number){   //可变长参数列表
            return (int)(Math.random()*number);
    }
    public static void main(String[] args){
        System.out.println("The random number is: " + getRandom(55));
    }
}
