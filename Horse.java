package studypackage;

/**
 * Created by Àð on 10.07.2015.
 */
public class Horse {
    private double distance;
    private String name;
    private double speed;
    Horse(String name,double speed,double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void move(){
        distance +=speed;
        speed = Math.random()*5;
    }
    public void print(){
        for(int i=0;i<distance;i++){
            System.out.print(".");
        }
        System.out.println(name);
    }
}
