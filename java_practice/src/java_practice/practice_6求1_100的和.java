package java_practice;
/*
 ����һ����������1~100�ĺ�
 */
public class practice_6��1_100�ĺ� {
	public static void main(String[] args) {
		System.out.println("�����"+getSum()); //�����5050
		System.out.println("=========");
		int getsum=getSum();
		System.out.println("���Ϊ"+getsum);//���Ϊ5050
	}
	public static int getSum() {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		return sum;
	}

}
