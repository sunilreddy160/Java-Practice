package corejava;
public class Inheritance {
	public static  class A {
		
		void display() {
			System.out.println("hello world");
			System.out.println("welcome to java");
		}
	}
	 public static class B extends A {
		
	}
	 public static class C extends A {
		 
	 }
	public static void main(String[] args) {
		       B b1 = new B();
		       b1.display();
	}
}
