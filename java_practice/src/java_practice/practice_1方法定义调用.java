package java_practice;
/*
	定义格式：
		public static void 方法名称() {
			方法体
		}
		
	调用格式：
		方法名称();
		
	注意：
	1，方法定义的先后顺序无所谓
	2，方法定义必须是挨着的，不能在一个方法的内部定义另一个方法
	3，方法定义后，自己不会执行的；如果要执行，一定要进行方法的调用
 */
public class practice_1方法定义调用 {
	public static void main(String[] args) {
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 20; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		printMethod(); //调用方法**名称
		
	}
	
	public static void printMethod() {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 20; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
