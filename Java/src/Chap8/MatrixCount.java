package Chap8;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/9 21:32
 * @Version 1.0
 **/
public class MatrixCount {
    public static double sumColumn(double[][] m,int columnIndex)
    {
        double sum=0;
        for(int i=0;i<m.length;i++){
            sum=sum+m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int m,n;
        double s;
        double[][] a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the row and the column of the array: ");
        m=input.nextInt();
        n=input.nextInt();
        System.out.println("Enter a "+m+"-by-"+n+" matrix row by row:");
        a=new double[m][n];
        for(int row=0;row<a.length;row++){
            for(int column=0;column<a[row].length;column++){
                a[row][column]=input.nextDouble();
            }
        }
        for(int i=0;i<n;i++){
            s=sumColumn(a,i);
            System.out.println("Sum of the elements at column "+i+" is "+s);
        }
    }
}
