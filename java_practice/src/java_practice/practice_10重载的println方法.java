package java_practice;

public class practice_10重载的println方法 {
	public static void main(String[] args) {
		myPrint(99);
		myPrint('a');
		myPrint('A'+01);
	}
	public static void myPrint(byte num) {
		System.out.println("byte值"+num);
	}
	public static void myPrint(short num) {
		System.out.println("short值"+num);
	}
	public static void myPrint(double num) {
		System.out.println("double值"+num);
	}
	public static void myPrint(long num) {
		System.out.println("long值"+num);
	}
	public static void myPrint(int num) {
		System.out.println("int值"+num);
	}
	public static void myPrint(float num) {
		System.out.println("float值"+num);
	}
	public static void myPrint(char num) {
		System.out.println("char值"+num);
	}

}
