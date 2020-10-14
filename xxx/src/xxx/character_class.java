package xxx;

public class character_class {
	public static void main(String[] args) {
		System.out.println("访问\"小艾同学\"");
		
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println(Character.isDigit('r'));
		System.out.println(Character.isDigit('9'));
		
		System.out.println(Character.isWhitespace('E'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
	
		
		System.out.println(Character.isUpperCase('r'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isUpperCase(' '));
		
		
		System.out.println(Character.isLowerCase('y'));
		System.out.println(Character.isLowerCase('E'));
		
		System.out.println(Character.toUpperCase('t'));
		System.out.println(Character.toUpperCase('Y'));
		
		System.out.println(Character.toLowerCase('Y'));
		System.out.println(Character.toLowerCase('i'));
		
		System.out.println(Character.toString('i'));
		System.out.println(Character.toChars('R'));
		System.out.println(Character.toString('Y'));
	}
	
	

}
