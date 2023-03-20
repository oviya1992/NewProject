package Final;

public class Person {
	static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		p1.age=30;
		p2.age=40;
		Person.age=20;
		System.out.println(p1.age);
		System.out.println(p2.age);
		}
}
