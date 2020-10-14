package java_practice;
/*
 定义一个方法，用来打印指定次数的hello world.
 */
public class practice_7打印指定次数的helloworld {
	public static void main(String[] args) {
		printCount(9);
	}
	public static void printCount(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("第"+(i+1)+"次hello world打印");
		}
	}

}
