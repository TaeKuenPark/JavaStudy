
package a1;

/*
 * 
 *  
 *  
 *  
 */
import java.util.Scanner;

class Point1 {
	String i = "1번 클래스";
	int v =1;
	
	public void println()	// 1번째로 선언된 클래스, 출력함수(출력, 입력 작업을 할시 따로 함수를 만드는것이 좋다)
	{
		System.out.println(i+","+v);
	}
}
class Point2 {
	String i = "2번 클래스";
	int v= 2;
	
	public void println()	//  2번째로 선언된 클래스
	{
		System.out.println(i+","+v);
	}
}

class Point3 {						// 클래스에는 범위(scope)를 지정하여, 변수, 함수를 지정해 줄수 있다
									// 이를 캡슐화(encapsulization)라고 한다.
	Scanner sc = new Scanner(System.in);
	int nh=10;						// default(공통)는 일반적으로 int형 변수를 쓰는 경우를 말하며, 현재 클래스, 함수안에서는 현재 함사 안에서만 선언됨.
	private int nx=11;				// private(프라이빗)개인, 현재 클래스 외부의 클래스에서는 선언이 불가하다.(예제: objectexample.class 전체에서는 x)
	protected int ny=12;			// protected(프로텍트)는 상속을 사용시 상속한 패키지 내부에서 사용가능하다
	public int nz=13;				// public(퍼블릭)패키지 및 모든 범위에서 사용가능하다.
	int sel;
	
	public void output()				// 현재 클레스에서 값을 출력하는 부분이다.
	{
			System.out.println("[출력] default : "+nh+", public"+nz+", private "+nx+"protect"+nz);	
		}
	}
						
	

//현재 클래스.(main)
public class ClassExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// InputStream클래스의 키보드로 입력을 받을수 있는 Scanner함수.
		
		Point1 point1 = new Point1();		// Point1의 클래스 생성자를 선언한다.				
		Point2 point2 = new Point2();		// Point2의 클래스 생성자를 선언한다.
		Point3 point3 = new Point3();		// Point3의 클래스 생성자를 선언한다.
		// 반드시 위처럼 내부 클래스(main)안에서 반드시 생성자를 선언해 주어야 해당 클래스를 사용할수있다.
		// 생성자를 선언해 줌으로서, 함수가 실행될때, 한번 선언 해주는 역활
		
		point1.println();
		point2.println();
		point3.output();
		System.out.println("[다른 클래스(외부클래스)에서의 출력] default : "+point3.nh+", public"+point3.nz+", private "+"[point3.nx는 권한에러!]"+"protect"+point3.nz);
		// private 권한을 가진 맴버는 출력이 안되는 것을 확인 가능하다.
	}
	
}