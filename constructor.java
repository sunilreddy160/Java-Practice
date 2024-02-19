package corejava;

public class constructor {
constructor() {
		int a = 5;
		int b = 9;
		System.out.println("hello world");
	}
	constructor(int a , int b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		constructor c = new constructor(6,6);
	}

}