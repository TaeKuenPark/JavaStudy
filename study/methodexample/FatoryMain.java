package methodexample;

public class FatoryMain {
public static void main(String[] args) {
	Factory fact = new Factory("울산");
	// 울산 공장에서는 자동차마다 지정된 번호로 자동차 생산 주문을 할때
	// 울산 공장에서 생산하는 자동차는 "소나타", "그랜져", "투싼" 3종류가 있다.
	// 자동차명은 고유한 저장소에 순서대로(0~2)로 저장되어있다.
	// 만약, 자동차 생산 주문시 0을 입력하면 소나타가 자동차가 생산된다.
	// 생산된 자동차는 종류별로 고유한 생산 번호가 자동으로 부여된다.
	// 형식 : S+순번, G+순번, T+순번
	// 예를 들어, 0번으로 소나타를 생산하면 고유번호는 S0로 부여된다.

	Car c1 = fact.orderCarById(0); // S0
	Car c2 = fact.orderCarById(1); // S0
	Car c3 = fact.orderCarById(2); // S0
	
	// 생산된 자동차가 저장하고 있는 정보는 다음과 같다
	// 공장명 : 울산, 이름: 소나타, 고유번호: S0
	// 따라서 공장에서는 각 자동차의 고유번호를 부여하기 위해 사용하는 일련번호를 저장하고 있어야 한다.
	// 울산공장에서는 소나타: 2대, 그랜져: 1대 투싼 :1대 이렇게 출력
	fact.printProductivity();
	
	System.out.println(c1.getInfo());	// 생산된 차의 품목을 보여준다
	System.out.println(c2.getInfo());	// 울산공장에서 생산된 소나타- 일련번호 : S0
	System.out.println(c3.getInfo());
}
}
