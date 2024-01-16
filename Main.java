public class Main {
	public static void main(String[] args) {

		Child b1 = new Child(1,2);
		Child b2 = new Child(3,4);

		System.out.println("abc vaue is :" + b1.abc + "efg value is :" + b1.efg);
		System.out.println("abc value is :" + b2.abc + "efg value is :" + b2.efg);
	}
}
