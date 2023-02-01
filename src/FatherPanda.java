
public class FatherPanda {
	public boolean isPredator;
	protected int weight;
	private int age;

	public void eat() {
		this.weight++;
		System.out.println("After each meal, Father Panda gains weight: " + weight);
		System.out.println("And his age is: " + age);
	}

	public static void main(String[] args) {
		FatherPanda fp = new FatherPanda();
		fp.age = 14;
		fp.weight = 347;
		fp.eat();
	}
}
