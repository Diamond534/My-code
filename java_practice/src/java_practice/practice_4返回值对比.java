package java_practice;
/*
 ע�⣻
 �з���ֵ�ķ���������ʹ�õ������ã���ӡ���߸�ֵ����
 �޷���ֵ�ķ�����ֻ��ʹ�õ������ã�
 */
public class practice_4����ֵ�Ա� {
	public static void main(String[] args) {
		System.out.println("�����"+getsum(10, 20)); //�����30
		System.out.println("=========");
		
		int num=getsum(10, 20);
		System.out.println("�����"+num);//�����30
		
		System.out.println("==========");
		printSum(20, 10);//�����30
	}
	//�з���ֵ
	public static int getsum(int a,int b) {
		int result=a+b;
		return result; 
	}
	//û�з���ֵ
	public static void printSum(int a,int b) {
		int result=a+b;
		System.out.println("�����"+result);
	}
	

}
