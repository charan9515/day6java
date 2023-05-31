package day6;
class cbit{

	String name="cbit";
	private int age;
	public String getName() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
}

public class Encapsulation {

//	private static String name;

	public static void main(String[] args) {
    cbit sc=new cbit();
    System.out.println("enter the name:");
    System.out.println(sc.getName());
    sc.setage(20);
    System.out.println("enter your age:");
    System.out.println(sc.getAge());
    System.out.println("my name is "+sc.getName()+" and age is "+sc.getAge()+""); 
	}

}
