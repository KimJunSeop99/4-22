package Ex12_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {

	public static void main(String[] args) {
//		ArrayList : 향상된 배열
//		add 하면 매개변수의 값이 내부 배열로 저장 ex) list[0] 저장
//		add 하면 매개변수의 값이 내부 배열로 저장 ex) list[1] 저장
//		add 하면 매개변수의 값이 내부 배열로 저장 ex) list[2] 저장
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));

		Iterator<Student> it = list.iterator();
//		while (it.hasNext()) : 배열같은 자료형에서 자료가 없을때까지 반복을 시킴.
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
		}
	}
}

class Student {
	String name = "";
	int ban;
	int no;

	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
