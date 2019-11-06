package Chap7;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 20:34
 * @Version 1.0
 **/
public class CountSingleFigures {
    public static void main(String[] args){
        int[] counts = new int[10];
        for (int i = 0; i < 100 ; i++){
            counts[(int)(Math.random()*10)] ++;
        }
        for (int i = 0;i < 10 ; i++){
            System.out.println(i + "出现了" + counts[i] + "次");
        }
    }
}
