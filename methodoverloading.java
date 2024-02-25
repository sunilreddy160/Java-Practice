package corejava;

public class methodoverloading {
              int addition(int a , int b) {
            	  this.a=a;
            	  this. b = b;
            	  return a+b;
              }
              double addition(int a, double b) {
            	  int c=a;
            	  double d = b;
            	  return c+d;
              }
              
	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		double res = m.addition(5,9);
	     System.out.println(res);
	}
}