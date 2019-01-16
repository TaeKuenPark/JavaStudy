package methodexample;

public class Car {

	
	String name;
	String f_Name;
	String id;
	
	public Car(String factoryName, String carName, String carId)
	{
		f_Name =factoryName;
		name= carName;
		id = carId;
	}

	public String getInfo() {
		String temp = f_Name+ "에서 생산된"+name+"- 일련번호  : "+id;
		return temp;
	}
	

}
