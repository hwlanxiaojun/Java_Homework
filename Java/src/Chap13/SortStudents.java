package Chap13;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/11/1 20:24
 * @Version 1.0
 **/

class Student implements Comparable<Student>{
    private int x;
    private int y;
    private int z;
    public int sum;
    Student(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.sum = x + y + z;
    }

    @Override
    public int compareTo(Student o) {
        if (sum > o.sum)
            return 1;
        else if (sum < o.sum)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "chinese:"+this.x+" math"+this.y+" english:"+this.z+" sum:"+this.sum;
    }
}
public class SortStudents {
    public static void main(String[] args){
        int x,y,z;
        Scanner input = new Scanner(System.in);

        Student[] students = new Student[3];
        for(int i = 0 ;i < 3 ; i++){
            System.out.print("Please Enter the student score:");
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            students[i] = new Student(x,y,z);
        }

        Arrays.sort(students);
        int i = 1;
        for (Student student:students){
            System.out.println("No." + i +" student " + student.toString());
            i++;
        }
    }
}
