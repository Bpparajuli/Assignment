public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String fanDetail() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }
    public static void main(String[] args) {
        Fan myFan = new Fan();
        myFan.setSpeed(FAST);
        myFan.setRadius(10);
        myFan.setColor("yellow");
        myFan.setOn(true);
        System.out.println(myFan.fanDetail());
    }
}
