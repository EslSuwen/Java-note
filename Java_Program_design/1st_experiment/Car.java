package exp1;

public class Car {
	int speed;
    void speedUp(int s){
        speed+=s;
    }
    void speedDown(int s){
        speed-=s;
    }
    void showSpeed(){
        System.out.println("speed is "+speed);
    }
}
