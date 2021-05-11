class A {void m1(A a) {System.out.print("A");}}
class B extends A {void m1(B b) {System.out.print("B");}}
class C extends B {void m1(C c) {System.out.print("C");}}
class D {
  public static void main(String[] args) {
    A c1 = new C(); B c2 = new C(); C c3 = new C(); C c4 = new C();
    c4.m1(c1); c4.m1(c2); c4.m1(c3);
}}