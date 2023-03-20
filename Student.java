package Final;

public class Student {
	public static void main(String[] args) {
		String name="oviya";
		System.out.println(name.hashCode());
		String name2="baskaran";
		System.out.println(name2.hashCode());
		String name3="oviya";
		System.out.println(name3.hashCode());
		name=name.concat(name2);
		System.out.println(name.hashCode());
	}

}
