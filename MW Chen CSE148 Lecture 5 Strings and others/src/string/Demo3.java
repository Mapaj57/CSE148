package string;

public class Demo3 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
		char c = str.charAt(1);
		System.out.println(c);
		System.out.println(str.substring(2));
		System.out.println(str);
		str = "fdsafdsaf dsafsa fdaf afdsafdsafds";
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
		System.out.println("\n---------");
		for(char c1 : chars) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n--------");
//		str = "John C. Doe 4.0 12345678, 6311234567";
//		String[] tokens = str.split(" ");
//		tokens[1] = tokens[1].substring(0, 1);
//		for (int i = 0; i < tokens.length; i++) {
//			tokens[i] = tokens[i].trim();
//			System.out.println(tokens[i]);
//		}
//		
//		double gpa = Double.parseDouble(tokens[3]);
//		int id = Integer.parseInt(tokens[4]);
//		System.out.println("Id = " + id);
		
		String names = "Jean B. Doe";
		int index = names.indexOf('.');
		System.out.println(index);
		System.out.println(names.charAt(5));
	}

}
