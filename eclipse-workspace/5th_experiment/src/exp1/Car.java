package exp1;

public class Car extends Vehicle implements Alarm {
	Car(String brand,String color)
	{
		super(brand,color);
	}
	
	public void alarm()
	{
		System.out.println("alarm");
	}
}
