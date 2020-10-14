package java_practice;
/*
 有参数；
 无参数；
 */
public class practice_3有参数和无参数 {
	public static void main(String[] args) {
		method1(50, 10); //结果是500
	}
	
	//两个数相乘；需要知道两个数字是多少，否则无法计算；
	//有参数
	public static void method1(int a,int b) {
		int result=a*b;
		System.out.println("结果是"+result); //结果是500
		System.out.println("==========");
		method2(); //无参数 ；调用
	}
	//eg；打印输出固定10次文本字符串
	//无参数
	public static void method2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world!!! "+i);
		}
	}

}
