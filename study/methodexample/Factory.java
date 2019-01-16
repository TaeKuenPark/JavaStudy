package methodexample;

public class Factory {
	
	String []carName = {"소나타", "그랜져", "투싼"};
	int [] id = new int [3];
	String []carId = {"S","G","T"};
	String factoryName;
	
	
	public Factory(String name)
	{
		factoryName = name;
	}
	
	public Car orderCarById(int id)
	{
		Car car= new Car(factoryName, carName[id], carId[id]+this.id[id]);
		this.id[id]++;
		
		return car;
	}
	
	public void printProductivity() {
		System.out.print(factoryName+"에서는 ");
		for(int size =0; size<id.length; size++)
		{	// 울산 공장에서는 소나타 2대 그랜져 1ㄷ대 투싼 0대가 출력
			System.out.print(carName[size]+ " : "+id[size]+"대");	// 몇대인지 출력
			if(size<id.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("");
	}
}
