package corejava;
    class A {
    	String name = "sunil";
    	void display() {
    		System.out.println("this was super class");
    	}
    }
    class B extends A {
    	String name = "reddy";
    	void display() {
     System.out.println(name);
    	System.out.println(super.name);
    	}
    	void print() {
    		super.display();
    	}
    }
public class superkeyword  {
    public static void main(String[] args) {
                B b = new B();   
         b.display();   
         b.print();
    }

}
