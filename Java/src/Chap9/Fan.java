package Chap9;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/7 14:38
 * @Version 1.0
 **/
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    public String color = "blue";

    public void setSpeed(int newSpeed)
    {
        this.speed = newSpeed;
    }
    public int getSpeed()
    {
        return speed;
    }

    public void setOn(boolean newState)
    {
        this.on = newState;
    }
    public boolean getOn()
    {
        return on;
    }

    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    public double getRadius()
    {
        return radius;
    }

    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    public String getColor()
    {
        return color;
    }

    public Fan(){
    }

    public String toString()
    {
        if(on)
        {
            return " speed " + speed  + " color " + color  + " radius " + radius;
        }
        else
        {
            return " fan is off " + " color " + color + " radius " + radius;
        }
    }
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("fan1:" + fan1.toString());
        System.out.println("fan2:" + fan2.toString());
    }
}
