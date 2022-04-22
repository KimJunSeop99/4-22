package Ex12_1;

import java.util.ArrayList;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();

//		ArrayList 자료넣기
		productList.add(new Tv());
		productList.add(new Audio());

//		ArrayList 자료넣기
//		tvList.add(new Tv());
//		tvList.add(new Tv());

		printAll(productList);
	}

	public static void printAll(ArrayList<Product> list) {
//		향상된 for문
//		list의 자료가 없을때 까지 반복문이 실행
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
