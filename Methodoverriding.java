package day6;
class teacher{
	int a=10;
	public void teach() {
		System.out.println("i am teacher");
	}
}
class mathsTeach extends teacher{
	public void teach() {
		super.teach();
		System.out.println("i am maths teacher");	
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		mathsTeach sc=new mathsTeach();
        sc.teach();
        System.out.println(sc.a);
	}

}