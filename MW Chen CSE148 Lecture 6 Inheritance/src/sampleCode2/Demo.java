package sampleCode2;

public class Demo {

	public static void main(String[] args) {
		Cat c1 = new Cat("Cat1", 3, "Mixed", "Grey");
		Dog d1 = new Dog("Dog1", 10, "Golden", true);
		c1.name = "Joey";
		c1.setAge(3.5);
		c1.move();
		d1.move();
		System.out.println(c1);
		System.out.println(d1);
		
		Pet p1 = new Pet("Joey", 2, "whatever");
		p1.move();
	}

}
