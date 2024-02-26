package corejava;

interface I  {
    int b = 10;

    void m1();
}

public class Interface implements I {
    public void m1() {
  //      char[] b;
		System.out.println(b);
    }

    public static void main(String[] args) {
              Interface in = new Interface();
              in.m1();
    }
}
