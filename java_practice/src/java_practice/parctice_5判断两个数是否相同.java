package java_practice;
/*
 定义一个方法；用来判断两个数是否相同；
 */
public class parctice_5判断两个数是否相同 {
	public static void main(String[] args) {
		System.out.println(isSame(50, 32));//false
		System.out.println(isSame(55, 55));//true
	}
	public static boolean isSame(int a,int b) {
//		boolean same;
//		if(a==b) {
//			same=true;
//		}else {
//			same=false;
//		}
		
//		boolean same=a==b?true:false;
		
//		boolean same=a==b;

		return a==b;
	}

}
