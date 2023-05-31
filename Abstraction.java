package day6;

abstract class animals{
	abstract void sound();
	public void type() {
		System.out.println("veg and non-veg");
	}
}
class crow extends animals{
	public void sound() {
		System.out.println("caow caow!!!");
	}
}
public class Abstraction {

	public static void main(String[] args) {
//	animals sc=new animals();
	crow sc=new crow();
	sc.sound();
	sc.type();

	}

}
