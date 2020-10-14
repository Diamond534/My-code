package java_practice;
/*
 方法重载（Overload）:多个方法名称一样，但参数列表不一样；
 
 注意
 1，参数个数不和；
 2，参数类型不同；
 3，参数的多类型顺序不同；
 */
public class practice_8方法重载 {
	public static void main(String[] args) {
//		System.out.println(sumTwo(1, 2));//3
//		System.out.println("======");
//		System.out.println(sumThree(10, 20,30));//60
//		System.out.println("======");
//		System.out.println(sumFour(100, 200, 300, 400));//1000
//		System.out.println("======");
//		System.out.println("======");
		
		//方法的重载
		System.out.println("两个数的和"+sum(13, 23)); //两个数的和36
		System.out.println("三个数的和"+sum(23, 33, 43)); //三个数的和99
		System.out.println("四个数的和"+sum(43, 53, 63, 73)); //四个数的和232
		
	}
	//参数类型不同；
	public static int sum(double a,double b) {
		return (int) (a+b);
	}
	//参数的多类型顺序不同；
	public static int sum(int a,double b) {
		return (int) (a+b);
	}
	public static int sum(double a,int  b) {
		return (int) (a+b);
	}
	//两个数相加
	public static int sum(int a,int b) {
		return a+b;
	}
	//两个数相加
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
		
	//两个数相加
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
