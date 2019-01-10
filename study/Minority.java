package a1;
/*
* 소수 란?
* 1을 제외한, 약수로 나누는 경우가 1외에 자기 자신 뿐인 수를 말한다.
* 아래는 공통적인 알고리즘.
*
*/
public class Minority {
	public static void main(String[] args)
	{
		int i,j, rate=0;							//	rate는 구할 갯수, 나머지는 임시 변수
		int count =0;								//  카운트가  0
		
		
// 1부터 소수의 일정 갯수까지 소수의 갯수를 구해보자
rate =10;											// 일정갯수
System.out.print("[소수 출력] ");						// 출력문
		for(i =1; i <= rate; i++)					// 알고리즘 : 1을 제외한, 약수로 나누는 경우가 1외에 자기 자신 뿐인 수를 말한다.
		{											// 그리고, 자신의 약수는 자신 보다 클수 없다
			for(j =2; j<i; j++)						// 그러므로, 1부터 자기 자신 전까지 나눠 나누어 떨어지는 수가 하나라도 있다면, 
			{										// 그수는 소수가 아니다.
				if(i%j == 0)
					break;
			}
			if(i !=2 && i != rate && i==j)			// 출력을 위한 문장1 (띄어주기 쓰기 문장)
				System.out.print(", ");						
			
			if(i==j)
			{
				System.out.print(i);				// 출력문
				count++;							// 갯수를 출력하기 위해 값 증가
					
			}
				
		}
		System.out.printf("\n[소수 갯수] %d",count);	// 소수의 갯수와 소수를 출력한다.
	}
}
