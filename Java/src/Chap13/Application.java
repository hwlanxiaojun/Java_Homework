package Chap13;

/**
 * @Author Lan XiaoJun
 * @Date 2019/11/1 19:48
 * @Version 1.0
 **/
interface Animal {
    public void cry();
    public String getAnimaName();
}

class Dog implements Animal{
    public void cry(){
        System.out.println("狗的叫声：汪汪汪");
    }
    public String getAnimaName(){
        return "名字：狗";
    }
}

class Cat implements Animal{
    public void cry(){
        System.out.println("猫的叫声：喵喵喵");
    }
    public String getAnimaName(){
        return "名字：猫";
    }
}

class Simulator{
    void playSound(Animal animal){
        animal.cry();
        System.out.println(animal.getAnimaName());
    }
}
public class Application {
    public static void main(String[] args){
        Simulator simulator = new Simulator();
        simulator.playSound(new Cat());
        simulator.playSound(new Dog());
    }
}