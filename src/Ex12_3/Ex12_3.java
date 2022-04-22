package Ex12_3;

import java.util.ArrayList;

// 지네릭스 테스트용 클래스들
class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}

}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

// 지네릭스 테스트용 인터페이스
interface Eatable {
}

public class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();

//		ArrayList 에 자료 저장
//		add 메소드 호출할때 마다 내부적으로 배열공간을 만들어서 저장 : [0]
//		add 메소드 호출할때 마다 내부적으로 배열공간을 만들어서 저장 : [1]
//		add 메소드 호출할때 마다 내부적으로 배열공간을 만들어서 저장 : [2]
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());

		grapeBox.add(new Grape());

		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);

	}

}

//지네릭스 클래스정의
//공통팀에서 만들수도 있음
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

// 향상된 배열(ArrayList)의 크기 cf) 배열의 length 와 같음
	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

// 지네릭스 클래스 정의 
// 공통팀에서 만들수 있음
class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}