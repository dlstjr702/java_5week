package days19;

import java.util.ArrayList;

/**
 * @author 양인석
 * @date 2026. 6. 8. 오전 9:00:04
 * @subject  
 * @content
 */

public class Ex01 {
	public static void main (String [] args) {


		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice= Juicer.makeJuice(fruitBox);
		System.out.println(juice);


		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();


		//The method makeJuice(FruitBox<Fruit>) in the type Juicer is not applicable for the arguments (FruitBox<Apple>)
		juice= Juicer.makeJuice(appleBox);
		System.out.println(juice);


	}//main

}//class



class Fruit{   public String toString() { return "Fruit";   }}
class Apple extends Fruit{   public String toString() {return "Apple";   }}
class Grape extends Fruit{   public String toString() {return "Grape";   }}

class Box<T>{
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
}




//제한된 제네릭 클래스
class FruitBox<T extends Fruit> extends Box<T>{


}



// 과일 -> 쥬스
class Juice{
	// 구현.. 가정

}

//과일 상자 -> 쥬스를 생산하는 기기
class Juicer{


	//[3] [2]번 메소드를 똑같은 기능의 제네릭 메소드 선언
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		// 가공 작업
		return new Juice();
	}



	// [2]와일드카드 방식
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		// 가공 작업
		return new Juice();
	}
	 */


	/* [1] 오버로딩
	static Juice makeJuice(FruitBox<Fruit> box) {
		// 가공 작업
		return new Juice();
	}

	 *
	 */


	//예) 제네릭 메소드
	static <T extends Fruit> void printAll( ArrayList<T> list
			, ArrayList<T> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}




}