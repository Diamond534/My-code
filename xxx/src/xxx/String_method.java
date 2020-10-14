package xxx;

public class String_method {
	public static void main(String[] args) {
		String s="www.scitc.cn";
		char result=s.charAt(5);
		System.out.println(result); //c
		
		String st1="string";
		String st2="string";
		String st3="string123";
		
		int result1=st1.compareTo(st2);
		System.out.println(result1); //0
		
		result1=st2.compareTo(st3);
		System.out.println(result1); //-3
		
		result1=st3.compareTo(st1);
		System.out.println(result1);
		
		
		
	}

}
