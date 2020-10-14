package java_practice;
/*
 注意；
 有返回值的方法；可以使用单独调用，打印或者赋值调用
 无返回值的方法；只能使用单独调用；
 */
public class practice_4返回值对比 {
	public static void main(String[] args) {
		System.out.println("结果是"+getsum(10, 20)); //结果是30
		System.out.println("=========");
		
		int num=getsum(10, 20);
		System.out.println("结果是"+num);//结果是30
		
		System.out.println("==========");
		printSum(20, 10);//结果是30
	}
	//有返回值
	public static int getsum(int a,int b) {
		int result=a+b;
		return result; 
	}
	//没有返回值
	public static void printSum(int a,int b) {
		int result=a+b;
		System.out.println("结果是"+result);
	}
	

}
