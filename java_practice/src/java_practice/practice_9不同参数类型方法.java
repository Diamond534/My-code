package java_practice;

public class practice_9不同参数类型方法 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		byte a=10;
		@SuppressWarnings("unused")
		byte b=20;
		System.out.println(isSame(12, 20));
		
		System.out.println(isSame(20.0, 20.00));
		
		System.out.println(isSame(30, 12));
		
		System.out.println(isSame(15l, 15l));
		
		System.out.println(isSame((byte) 12, (byte)12));
		
	}
	public static boolean isSame(short a,short b) {
		System.out.println("两个short参数的方法执行：");
		boolean same;
		if(a==b) {
			same=true;
		}else {
			same=false;
		}
		return same;
	}
	
	public static boolean isSame (double a,double b) {
		System.out.println("两个double参数的方法执行：");
		boolean same=a==b?true:false;
		return same;
	}
	
	public static boolean isSame(int a,int b) {
		System.out.println("两个int参数的方法执行：");
		return a==b;
	}
	
	public static boolean isSame(long a,long b) {
		System.out.println("两个long参数的方法执行：");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isSame( byte a,byte b) {
		System.out.println("两个byte参数的方法执行：");
		return a==b;
	}
	

}
