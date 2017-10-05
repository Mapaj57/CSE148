package p2;

import java.util.Arrays;

public class BagDemo {

	public static void main(String[] args) {
		BodyBag theBag = new BodyBag(10);
		theBag.insert("Johnny", 20, 3, 100, 100, 100, 100);
		theBag.insert("Suzy", 20, 1, 100, 50, 80, 100);
		theBag.insert("Joey", 20, 3, 100, 100, 100, 100);
		theBag.insert("Kathy", 20, 3, 100, 100, 100, 100);
		// theBag.display();
		// System.out.println("----------");
		// System.out.println(theBag.removeByName("Joey"));
		// System.out.println("-----------");
		// theBag.display();
		System.out.println("-----------People Hightest Letter Grades:");

		Student[] peopleWithHighestLetterGrade = theBag.findPersonsHighestLetterGrade();
		for (int i = 0; i < peopleWithHighestLetterGrade.length; i++) {
			System.out.println(peopleWithHighestLetterGrade[i]);
		}
	}

}
