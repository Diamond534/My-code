package java_practice;
/*
 �������أ�Overload��:�����������һ�����������б�һ����
 
 ע��
 1�������������ͣ�
 2���������Ͳ�ͬ��
 3�������Ķ�����˳��ͬ��
 */
public class practice_8�������� {
	public static void main(String[] args) {
//		System.out.println(sumTwo(1, 2));//3
//		System.out.println("======");
//		System.out.println(sumThree(10, 20,30));//60
//		System.out.println("======");
//		System.out.println(sumFour(100, 200, 300, 400));//1000
//		System.out.println("======");
//		System.out.println("======");
		
		//����������
		System.out.println("�������ĺ�"+sum(13, 23)); //�������ĺ�36
		System.out.println("�������ĺ�"+sum(23, 33, 43)); //�������ĺ�99
		System.out.println("�ĸ����ĺ�"+sum(43, 53, 63, 73)); //�ĸ����ĺ�232
		
	}
	//�������Ͳ�ͬ��
	public static int sum(double a,double b) {
		return (int) (a+b);
	}
	//�����Ķ�����˳��ͬ��
	public static int sum(int a,double b) {
		return (int) (a+b);
	}
	public static int sum(double a,int  b) {
		return (int) (a+b);
	}
	//���������
	public static int sum(int a,int b) {
		return a+b;
	}
	//���������
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
		
	//���������
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
