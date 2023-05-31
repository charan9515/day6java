package day6;

import java.util.Scanner;

public class Encapsex {
	private String name;
	private int age;
	
	public void stName(String name) {
		this.name=name;
	}
	public void stAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Encapsex ss=new Encapsex();
		System.out.println("enter your name:");
		String n=sc.next();
		System.out.println("enter your age:");
        int a=sc.nextInt();
        ss.stName(n);
        ss.stAge(a);
        System.out.println("my name is "+ss.getName()+" and age is "+ss.getAge()+"");
	}

}
