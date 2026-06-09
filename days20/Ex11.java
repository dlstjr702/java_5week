package days20;


/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject  
 * @content  
 */

public class Ex11 {

	public static void main(String[] args) {

		/*
		 * 1. 람다식(Lambda Experession)
		 * 	1)JDK 1.5 : 제네릭
		 * 	  JDK 1.8 : 람다식
		 *  2) 자바는 객체 지향 프로그래밍 언어 + 함수형 언어
		 *    함수형 언어 = 독립적인 함수
		 * 2. 람다식 ? 메소드를 하나의 수식으로 표현한것.
		 *   람다식 == 익명함수( Anonymous Function)
		 * 3. 메소드보다 코디이 간결하고 이해가 쉬받.
		 *   OOP 불편한점 : 메소드를 사용하려면 개체를 먼저 생성한후에
		 *    객체명.메소드명()호출.
		 * 4.람다식을 사용해서 메소드를 변수처럼 다룰 수있다.
		 * 5. 람다식 선언 형식
		 *     - 메소드 이름 제거 + 리턴타입 제거
		 *       매개변수 선언부와 몸체{} 사이에 -> 연산자 추가
		 *       예)리턴타입 메서드명(매개변수..){
		 *       //
		 *       //
		 *       return 리턴값;
		 *       
		 *       }
		 *       (매개변수..)-> {}
		 *       예) int max (int a, int b) {
		 *       	return a>b? a:b;
		 *       }
		 *       
		 *       (int a, int b) ->{
		 *       	return a>b?a:b;
		 *       }
		 *6.
		 *(int a, int b) -> {return a>b?a:b}
		 * 반환값이 있는 경우 retrun 문 대신 수식으로 대신할수있다.
		 * (int a, int b) -> a>b?a:b   세미콜론은 붙이지 않는다
		 *                                자동으로 반환갑이 된다.
		 *                                {} 중괄호 생략가능하다
		 *                                
		 * 매개변수의 타입이 추측가능할때는 자료형 생략가능하다.
		 * 어느 하나만 타입을 생략할 수는 없다.
		 * (a,b) -> a>b?a:b
		 * 
		 * 만약에 매개변수가 1개인 경우 ()괄호 생략가능하다.
		 * (int a) -> a*a
		 * 
		 * int aX
		 * 
		 * (String name , int age) -> { //{}명령라인이 1줄 일 경우만 생략가능
		 * syso(name)
		 * syso(age)
		 * }
		 *   
		 * 
		 * */


	} // main

} // class


