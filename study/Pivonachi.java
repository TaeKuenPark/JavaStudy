package a1;
/*
* 피보나치 수열에 대해 알아보자
*
* 피보나치 수열이란?
* 1,1,2,3,5,8,13,21,34.... 으로 
*  0, 1, 1, 2, 3, 5, 8, 13 ....
*    0, 1, 1, 2, 3, 5 ....
*    으로, n항과 다음 n+1항의 합이 n+2항의 값이 되는 수열을 말한다.
*/
public class Pivonachi {
	public static void main(String[] args) {
		int a = 1;									// a는 첫항을 의미
		int n = 1;									// n은 다음항
		int n_next =0;								// n_next는 앞과 앞의 앞을 합한 다음다음항
		int cont = 10;
		
		System.out.print(a+", "+n+", ");			// 알고리즘 해석은 알아서..
		for(int i =a; i <=cont; i++)
		{
			n_next = a+n;
			System.out.print(n_next);
			a =n;
			n = n_next;
			
			if(i != cont)
				System.out.print(", ");			// 계속 따옴표를 붙이는 용도
		}
	}
}
