package corejava;
     interface abc {
    	 int x = 200;
    	 void m1();
     }
     interface xyz {
    	 int y =200;
    	 void y1();
     }
public class multipleinheritance implements abc,xyz{
              public void m1() {
            	  System.out.println(x);
              }
              public void y1() {
            	  System.out.println(y);
              }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   multipleinheritance mi = new multipleinheritance();
                           mi.m1();
                           mi.y1();
	}

}
