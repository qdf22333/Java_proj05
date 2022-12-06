package chapter05.ex09;

public class Sharing_String_Object {

	public static void main(String[] args) {
		// 문자열 객체의 공유
		
		//1. 문자열 객체의 공유 : 리터럴로 객체를 생성시 공유됨
		//		new 생성자를 사용해서 객체를 생성할 때는 공유되지 않는다. 별도의 공간에 생성됨.
		
		String str1 = new String ("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = "안녕";
		String str5 = new String ("안녕");
		
		
		//2. Stack 메모리의 주소값 비교 (== : Stack의 값을 비교)
		//		equls() : Heap의 값을 비교 참조객체.equls(비교객체);
		System.out.println(str1 == str2);	//false
		System.out.println(str2 == str3);	//t
		System.out.println(str3 == str4);	//t
		System.out.println(str2 == str4);	//t
		System.out.println(str1 == str5);	//f

	}

}
