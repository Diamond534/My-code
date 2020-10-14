package java_practice;
/*
 定义一个方法；求1~100的和
 */
public class practice_6求1_100的和 {
	public static void main(String[] args) {
		System.out.println("结果是"+getSum()); //结果是5050
		System.out.println("=========");
		int getsum=getSum();
		System.out.println("结果为"+getsum);//结果为5050
	}
	public static int getSum() {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		return sum;
	}

}
