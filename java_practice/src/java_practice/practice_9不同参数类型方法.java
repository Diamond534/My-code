package java_practice;

public class practice_9��ͬ�������ͷ��� {
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
		System.out.println("����short�����ķ���ִ�У�");
		boolean same;
		if(a==b) {
			same=true;
		}else {
			same=false;
		}
		return same;
	}
	
	public static boolean isSame (double a,double b) {
		System.out.println("����double�����ķ���ִ�У�");
		boolean same=a==b?true:false;
		return same;
	}
	
	public static boolean isSame(int a,int b) {
		System.out.println("����int�����ķ���ִ�У�");
		return a==b;
	}
	
	public static boolean isSame(long a,long b) {
		System.out.println("����long�����ķ���ִ�У�");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isSame( byte a,byte b) {
		System.out.println("����byte�����ķ���ִ�У�");
		return a==b;
	}
	

}
