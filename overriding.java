package corejava;

public class overriding {
            class A {
            	void display() {
            		System.out.println("well")
            	}
            }
            static class B {
            	void display() {
            		System.out.println("done");
            	}
            }
	public static void main(String[] args) {
		B b1 = new B();
		b1.display();
	}

}
