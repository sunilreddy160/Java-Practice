package corejava;

class A {
    void m1() {
        System.out.println("this was class");
    }
}

interface A22 {
    void m2();
}

interface B22 {
    void m3();
}

public class hybridinheritance extends A implements A22, B22 {
    public void m2() {
        System.out.println("this was it");
    }

    public void m3() {
        System.out.println("i am done ");
    }

    public static void main(String[] args) {
        hybridinheritance h1 = new hybridinheritance();
        h1.m1();
        h1.m2();
        h1.m3();
    }
}