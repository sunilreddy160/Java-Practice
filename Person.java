package corejava;

public class Person {
        int a ;
        int b;
        void display(int a, int b) {
        	System.out.println(a+b);
        	System.out.println("welcome");
        }
	public static void main(String[] args) {
	    Person p1 = new Person() ;
	    p1.display(5,6);
	}
}