package corejava;

public class overloading {
        overloading() {
        	int a = 5;
        	int b= 4;
        	System.out.println(a+b);
        }
        overloading(int a, int b) {
        	System.out.println(a+b);
        }
        
  overloading(int a , int b, int c) { //paramatarized constructor        
        	int x = a;
        	int y = b;
        	int z = c;
        	System.out.println(x+y+z);
        }
	public static void main(String[] args) {
		
            overloading o = new overloading();
      
	}
}